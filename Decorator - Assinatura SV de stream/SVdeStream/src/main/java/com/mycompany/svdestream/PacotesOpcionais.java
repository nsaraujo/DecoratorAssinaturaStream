/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.svdestream;

/**
 *
 * @author 55649
 */
public class PacotesOpcionais extends ServicosOpcionais {
    
    public PacotesOpcionais(InfoServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + ", Assistir videos em varios dispositivos";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + 19.99;
    }
}

    class PacoteFreteGratis extends ServicosOpcionais {
    public PacoteFreteGratis(InfoServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + ", Frete Gratis em produtos";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + 9.99;
    }
}

    class PacoteCaixaSurpresa extends ServicosOpcionais {
    public PacoteCaixaSurpresa(InfoServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + ", Caixa surpresa com produtos relacionados a filmes e series";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + 29.99;
    }
}

    class PacoteCartaoPlatinum extends ServicosOpcionais {
    public PacoteCartaoPlatinum(InfoServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + ", Cartão de credito Platinum";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + 49.99;
    }
}

    class PacoteCashBack extends ServicosOpcionais {
    public PacoteCashBack(InfoServico servico) {
        super(servico);
    }

    @Override
    public String getDescricao() {
        return servico.getDescricao() + ", Compra com Cash Back";
    }

    @Override
    public double getPreco() {
        return servico.getPreco() + 19.99;
    }
}

