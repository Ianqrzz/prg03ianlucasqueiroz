/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author ianep
 */
public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    
    @Override
    public String imprimirRecibo() {
        
        String recibo = "total valor pago com Cartão: "+this.valor;
        
        return recibo;
    }

    @Override
    public double calcularTotal() {
        
        valor += valor *0.05;
        setValor(valor);
        
      return this.valor;
        
           
    }
    
    
}
