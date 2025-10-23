/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author ianep
 */
public class PagamentoPix implements Pagamento{

    
    private double valor;
    private double cashback;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calcularTotal() {
        
        this.cashback = valor *0.02;
        return this.valor;
    }

    @Override
    public String imprimirRecibo() {
        
        
     String recibo = "total valor pago com Dinheiro: "+this.valor +"valor do cashback:" +this.cashback;
        
        return recibo;    }
    
}
