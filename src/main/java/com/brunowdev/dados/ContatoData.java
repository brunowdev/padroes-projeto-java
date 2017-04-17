package com.brunowdev.dados;

import com.brunowdev.model.Contato;

import java.util.Arrays;
import java.util.List;

/**
 * Created by BRUNO-PC on 16/04/2017.
 */
public final class ContatoData {

    private ContatoData() {}

    public static List<Contato> lerContatosCSV(final String urlArquivo) {
        logLeituraArquivo(urlArquivo);
        return mockContatos();
    }

    public static List<Contato> lerContatosXML(final String urlArquivo) {
        logLeituraArquivo(urlArquivo);
        return mockContatos();
    }

    private static List<Contato> mockContatos() {
        Contato contato1 = new Contato("Bruno", "brunowdev@gmail.com");
        Contato contato2 = new Contato("Mulder", "mulder@gmail.com");
        return Arrays.asList(contato1, contato2);
    }

    private static void logLeituraArquivo(String arquivo) {
        System.out.println(String.format("Lendo arquivo %s", arquivo));
    }

}
