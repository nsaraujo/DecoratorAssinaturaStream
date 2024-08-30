/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.svdestream;

/**
 *
 * @author 55649
 */
public class SVdeStream {

    public static void main(String[] args) {
      
        InfoServico assinatura = new AssinaturaBasica();
        
        assinatura = new PacotesOpcionais(assinatura);
        assinatura = new PacoteFreteGratis (assinatura);
        assinatura = new PacoteCaixaSurpresa (assinatura);
        assinatura = new PacoteCartaoPlatinum (assinatura);
        assinatura = new PacoteCashBack (assinatura);
        
        System.out.println(assinatura.getDescricao() + " - Preco: R$ " + assinatura.getPreco());
        
        InfoServico assinatura02 = new AssinaturaBasica();
        System.out.println(assinatura02.getDescricao() + " - Preco: R$ " + assinatura02.getPreco());
        
        InfoServico assinatura03 = new AssinaturaBasica();
        assinatura03 = new PacoteFreteGratis(assinatura03);
        System.out.println(assinatura03.getDescricao() + " - Preco: R$ " + assinatura03.getPreco());
        
    }
}

    

