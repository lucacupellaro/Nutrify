package com.example.progetto;

import com.example.progetto.utils.OAuth;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

public class GoogleController implements Initializable {

    @FXML
    private WebView webView;

    private WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try{
            String state = OAuth.random64Url(32);
            String code_verifier = OAuth.random64Url(32);
            String codeChallenge = OAuth.random64Url(32);
            String codeChallengeMethod = "S256";
            String clientId="47629690745-q31tr55cdogq86m2oak44o4an2dm8661.apps.googleusercontent.com";
            String clientSecret = "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";
            String authorizationEndpoint = "https://accounts.google.com/o/oauth2/v2/auth";
            String clientEndpoint = "https://www.googleapis.com/oauth2/v4/token";
            String userInfoEndpoint = "https://www.googleapis.com/oauth2/v3/userinfo";
            String reference = "Hello";

            //String query = "https://www.google.com";
            String query = String.format("%s?response_type=code&scope=profile&redirect_uri=%s&client_id=%s&state=%s&code_challenge=%s&code_challenge_method=%s",
                    authorizationEndpoint,
                    reference,
                    clientId,
                    state,
                    codeChallenge,
                    codeChallengeMethod);
            engine = webView.getEngine();
            engine.load(query);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
