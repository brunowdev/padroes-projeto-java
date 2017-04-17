package com.brunowdev.model.maladireta;

import com.brunowdev.dados.ContatoData;
import com.brunowdev.model.Contato;

import java.util.List;

/**
 * Created by BRUNO-PC on 16/04/2017.
 */
public final class MalaDireta {

    private MalaDireta() {}

    public static boolean enviarEmail(String arquivo, String mensagem) {

        List<Contato> contatos = ContatoData.lerContatosCSV("contato.csv");

        contatos.stream().forEach(contato -> {
            logEnvioEmail(contato, mensagem, "Notificação Padrões de Projeto");
        });

        return true;
    }

    private static void logEnvioEmail(Contato contato, String mensagem, String assunto) {
        System.out.println(String.format("From: %s - %s", "Bitencourt Comunicação", "bcomunicacao@bitencourtcomunicacao.com"));
        System.out.println(String.format("To: %s - %s", contato.getNome(), contato.getEmail()));
        System.out.println(String.format("Topic: %s - %s", assunto, mensagem));
        System.out.println(String.format("Status: %d", 200));

    }

}
