package com.brunowdev.view;

import com.brunowdev.model.maladireta.MalaDireta;

import javax.swing.*;

/**
 * Created by BRUNO-PC on 16/04/2017.
 */
public class Principal {

    public static void main(String... args) {

        final String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem do e-mail: ");

        final boolean resultado = MalaDireta.enviarEmail("arquivo.csv", mensagem);

        System.out.println(String.format("E-mails enviados com %s.", resultado ? "sucesso" : "falha"));

    }

}
