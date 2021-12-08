package com.u2d.paralela.runnable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunnableBuscaTextual implements Runnable {

    private String nomeArquivo;
    private String nome;

    public RunnableBuscaTextual(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(new File(nomeArquivo))) {
            var row = 1;
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains(nome))
                    System.out.println(nomeArquivo + "-" + row + "-" + linha);
                row++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
