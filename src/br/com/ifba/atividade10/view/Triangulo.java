/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public final class Triangulo extends Forma2D{
    
    private double altura;
    private double base;
    
    
    public final double obterArea(){
        
        double area = this.base * this.altura;
        
        return area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public String toString() {
        return String.format("O triangulo de altura"+altura+" e base "+base);
    }
}
