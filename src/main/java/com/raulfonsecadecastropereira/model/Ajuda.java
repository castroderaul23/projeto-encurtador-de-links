package com.raulfonsecadecastropereira.model;

public class Ajuda {

    private String estudante;
    private String projeto;

    public Ajuda(String estudante, String projeto) {
        this.estudante = estudante;
        this.projeto = projeto;
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
