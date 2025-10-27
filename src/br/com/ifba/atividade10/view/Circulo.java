/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public final class Circulo extends Forma2D {
    
    private double raio;
    
    
    @Override
    public final double obterArea(){
        
        double area = raio * raio;
        
        return area;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public String toString(){
      
        return String.format("o raio desse ciruclo e" +raio);
        
    }

   
    
}
