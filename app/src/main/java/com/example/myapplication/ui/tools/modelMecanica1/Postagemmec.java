package com.example.myapplication.ui.tools.modelMecanica1;

public class Postagemmec {

    private String nome1;
    private String postagem1;
    private int imagem1;

    public Postagemmec() {
    }

    public Postagemmec(String nome1, String postagem1, int imagem1) {
        this.nome1 = nome1;
        this.postagem1 = postagem1;
        this.imagem1 = imagem1;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getPostagem1() {
        return postagem1;
    }

    public void setPostagem1(String postagem1) {
        this.postagem1 = postagem1;
    }

    public int getImagem1() {
        return imagem1;
    }

    public void setImagem1(int imagem1) {
        this.imagem1 = imagem1;
    }
}
