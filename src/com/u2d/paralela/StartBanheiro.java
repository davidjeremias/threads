package com.u2d.paralela;

import com.u2d.paralela.action.ActionBanheiro;
import com.u2d.paralela.runnable.RunnableNumero1;
import com.u2d.paralela.runnable.RunnableNumero2;

public class StartBanheiro {
    public static void main(String[] args) {

        ActionBanheiro actionBanheiro = new ActionBanheiro();

        Thread convidado1 = new Thread(new RunnableNumero1(actionBanheiro), "João");
        Thread convidado2 = new Thread(new RunnableNumero2(actionBanheiro), "Davi");

        convidado1.start();
        convidado2.start();
    }
}
