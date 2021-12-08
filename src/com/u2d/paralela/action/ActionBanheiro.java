package com.u2d.paralela.action;

public class ActionBanheiro {

    public void fazNumero1() {
        String nome = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(nome + " Entrando no banheiro");
            System.out.println(nome + " Fazendo num 1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " Descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " Saindo no banheiro");
        }
    }

    public void fazNumero2() {
        String nome = Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(nome + " Entrando no banheiro");
            System.out.println(nome + " Fazendo num 2");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " Descarga");
            System.out.println(nome + " lavando a mão");
            System.out.println(nome + " Saindo no banheiro");
        }
    }
}
