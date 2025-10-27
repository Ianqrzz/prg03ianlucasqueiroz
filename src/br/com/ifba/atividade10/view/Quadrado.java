/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public final class Quadrado extends Forma2D{
    
    private double lado;
    
    @Override
    public final double obterArea(){
       
        double area = this.lado * this.lado;
        return area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
       
         return String.format("o lado desse quadradro é"+lado);
    }
    
}
