package com.u2d.paralela.runnable;

import com.u2d.paralela.action.ActionBanheiro;

public class RunnableNumero2 implements Runnable {

    private ActionBanheiro actionBanheiro;

    public RunnableNumero2(ActionBanheiro actionBanheiro) {
        this.actionBanheiro = actionBanheiro;
    }

    @Override
    public void run() {
        actionBanheiro.fazNumero2();
    }
}
