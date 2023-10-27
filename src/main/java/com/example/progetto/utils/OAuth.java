package com.example.progetto.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class OAuth {
    private String clientID;
    private String clientSecret;
    private String authorizationEndpoint;
    private String tokenEndpoint;
    private String userInfoEndpoint;

    public OAuth(){
        clientID=new String("47629690745-q31tr55cdogq86m2oak44o4an2dm8661.apps.googleusercontent.com");

    }
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

    public static String escape(String s){
        return s.replace("\\", "\\\\")
                .replace("\t", "\\t")
                .replace("\b", "\\b")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\f", "\\f")
                .replace("\'", "\\'")      // <== not necessary
                .replace("\"", "\\\"");
    }
}
