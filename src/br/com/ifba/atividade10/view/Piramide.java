/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public class Piramide extends Forma3D{
    
    private double lado;
    private double altura;

    public Piramide(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    

    @Override
    public double obterArea() {
        
        double area = lado * lado;
        return area;
        
    }

    @Override
    public double obterVolume() {
        double volume = ((lado * lado) * altura) / 3;
        return volume;
    }

    @Override
    public String toString() {
        return String.format(" a piramide  de  lado"+lado+" e altura"+altura);
    }
    
}
