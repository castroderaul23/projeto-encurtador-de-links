package com.raulfonsecadecastropereira.model;

public class UrlProcessada {

    private String urlOriginal;
    private String urlEncurtada;

    public UrlProcessada() {}

    public UrlProcessada(String urlOriginal, String urlEncurtada) {
        this.urlOriginal = urlOriginal;
        this.urlEncurtada = urlEncurtada;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }
}
