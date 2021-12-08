package com.u2d.paralela.runnable;

import com.u2d.paralela.action.ActionBanheiro;

public class RunnableNumero1 implements Runnable {

    private ActionBanheiro actionBanheiro;

    public RunnableNumero1(ActionBanheiro actionBanheiro) {
        this.actionBanheiro = actionBanheiro;
    }

    @Override
    public void run() {
        actionBanheiro.fazNumero1();
    }
}
