package com.u2d.paralela;

import com.u2d.paralela.runnable.RunnableBuscaTextual;

public class StartBuscaArquivos {

    public static void main(String[] args) {
        String nome = "Jon";

        Thread threadAssinaturas1 = new Thread(new RunnableBuscaTextual("assinaturas1.txt", nome));
        Thread threadAssinaturas2 = new Thread(new RunnableBuscaTextual("assinaturas2.txt", nome));
        Thread threadAutores = new Thread(new RunnableBuscaTextual("autores.txt", nome));

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();
    }
}
