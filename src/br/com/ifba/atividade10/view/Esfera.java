/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public final class Esfera extends Forma3D {

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea() {
        
        double area = 4 * Math.PI * raio * raio;
        return area;
        
    }

    @Override
    public double obterVolume() {
        double volume = (4/3) * Math.PI * raio * raio * raio;
        return volume;
    }

    @Override
    public String toString() {
        
        return String.format(" A esfera de raio:" + raio);
    }
    
    
}
