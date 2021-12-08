package com.u2d.paralela.action;

import com.u2d.paralela.runnable.RunnableMultiplicacao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionMultiplicacao implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public ActionMultiplicacao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RunnableMultiplicacao tarefaMultiplicacao = new RunnableMultiplicacao(primeiro, segundo, resultado);
        Thread threadCalculo = new Thread(tarefaMultiplicacao, "Multiplicação-thread");
        threadCalculo.start();
    }
}
