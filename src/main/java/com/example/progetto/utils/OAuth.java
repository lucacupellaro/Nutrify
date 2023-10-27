package com.example.progetto.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Properties;

public class OAuth {

    //funzione per la creazione di una stringa casuale di lunghezza length
    public static String random64Url(int length){
        SecureRandom rng = new SecureRandom(); //oggetto di tipo SecureRandom che mi consentirà di generare un numero di byte casuali
        byte[] bytes = new byte[length];//realizzo un array di byte di lunghezza length
        rng.nextBytes(bytes);//genero un array di byte casuali e li inserisco nell'array bytes
        return random64UrlNoPadding(bytes);
    }

    //funzione per eliminare tutti i caratteri non voluti in un insieme di byte
    public static String random64UrlNoPadding(byte[] buf){
        String base64 = new String(buf, StandardCharsets.UTF_8);
        base64 = base64.replace("+","-");
        base64 = base64.replace("/","_");
        base64 = base64.replace("=","");

        return base64;
    }
    public static byte[] sha256(String buf) throws NoSuchAlgorithmException {
        byte[] bytes = buf.getBytes();
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        return sha256.digest(bytes);
    }

    public static String generateQuery() throws NoSuchAlgorithmException, IOException{
        FileInputStream f = new FileInputStream(Objects.requireNonNull(OAuth.class.getResource("/Config/Cfg.properties")).toString().replace("file:",""));
        Properties cfg = new Properties();
        cfg.load(f);
        f.close();
        String state = OAuth.random64Url(32);
        String codeVerifier = OAuth.random64Url(32);
        String codeChallenge = OAuth.random64UrlNoPadding(sha256(codeVerifier));
        String reference = "none";
        return String.format("%s?response_type=code&scope=%s&redirect_uri=%s&client_id=%s&state=%s&code_challenge=%s&code_challenge_method=%s",
                cfg.getProperty("authorizationEndPoint"),
                cfg.getProperty("scope"),
                reference,
                cfg.getProperty("clientID"),
                state,
                codeChallenge,
                cfg.getProperty("codeChallengeMethod")
        );
    }
}
