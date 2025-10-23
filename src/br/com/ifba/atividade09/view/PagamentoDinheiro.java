/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author ianep
 */
public class PagamentoDinheiro implements Pagamento{

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calcularTotal() {

        valor -= valor*0.10;
        setValor(valor);
        
        return this.valor;


    }

    @Override
    public String imprimirRecibo() {
        
        String recibo = "total valor pago com Dinheiro: "+this.valor;
        
        return recibo;
    }
    
   
    
}
