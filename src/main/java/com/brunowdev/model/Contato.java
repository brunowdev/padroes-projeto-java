package com.brunowdev.model;

/**
 * Created by BRUNO-PC on 16/04/2017.
 */
public class Contato {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
