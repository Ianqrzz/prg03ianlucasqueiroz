/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public final class Cubo extends Forma3D{
    
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double obterArea() {
        
        double area = 6 * aresta * aresta;
        return area;
    }

    @Override
    public double obterVolume() {
        
        double volume = aresta * aresta * aresta;
        return volume;
    }

    @Override
    public String toString() {
     return String.format("O cubo de aresta:"+aresta);
    }
    
    
}
