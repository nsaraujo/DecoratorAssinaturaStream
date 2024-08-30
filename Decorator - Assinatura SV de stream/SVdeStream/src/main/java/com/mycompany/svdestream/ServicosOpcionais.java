/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.svdestream;

/**
 *
 * @author 55649
 */
public abstract class ServicosOpcionais implements InfoServico {
    protected InfoServico servico;

    public ServicosOpcionais(InfoServico servico) {
        this.servico = servico;
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao();
    }

    @Override
    public double getPreco() {
        return servico.getPreco();
    }
}

