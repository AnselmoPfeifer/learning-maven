package com.anselmo.cursomaven;

/**
 * Created by anselmo on 25/04/16.
 */
public class Produto {
    private final String nome;
    private final double preco;
//    private final String categoria = "Comida";

    public Produto(String nome, double preco){
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoComImposto(){
        return preco * 1.10;
    }
}
