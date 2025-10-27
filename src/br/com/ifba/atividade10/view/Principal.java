/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author ianep
 */
public class Principal {
    
    public static void main(String[] args){
        
        Forma array[] = new Forma[6];
        
        array[0] = new Circulo(4.0);
        array[1] = new Triangulo(4.0,5.0);
        array[2] = new Quadrado(4.0);
        array[3] =  new Piramide(4.0,5.0);
        array[4] = new Esfera(7.0);
        array[5] = new Cubo(5.0);
        
        
        for ( Forma formas : array){
            
            System.out.println(formas.toString());
            
            if(formas instanceof Forma2D){
                Forma2D novo =(Forma2D) formas;
                System.out.println("area :"+novo.obterArea());
            }
            else{
                Forma3D novo = (Forma3D) formas;
                System.out.println("area :"+novo.obterArea());
                System.out.println("volume: "+ novo.obterVolume());
            }
        }
        
        
    }
    
}
