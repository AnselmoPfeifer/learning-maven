package com.anselmo.cursomaven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTest{
    @Test
    public void verifica_preco_com_imposto() {
        Produto bala = new Produto("juquinha", 0.10);
                assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
        System.out.println("O nome da bala eh: " + bala.getNome() + " com valor: R$ " + bala.getPreco());
    }

}