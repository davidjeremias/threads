package com.u2d.paralela.tela;

import com.u2d.paralela.action.ActionMultiplicacao;

import javax.swing.*;

public class TelaMultiplicacao {

    public void gerarTelaMultiplicacao(){
        JFrame janela = new JFrame("Multiplicação Demorada");

        JTextField primeiro = new JTextField(10);
        JTextField segundo = new JTextField(10);
        JButton botao = new JButton(" = ");
        JLabel resultado = new JLabel("       ?       ");

        botao.addActionListener(new ActionMultiplicacao(primeiro, segundo, resultado));

        JPanel painel = new JPanel();
        painel.add(primeiro);
        painel.add(new JLabel("x"));
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultado);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}
