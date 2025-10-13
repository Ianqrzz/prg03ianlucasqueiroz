/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ianep
 */
public class ContaBanco {
    
    public int num_conta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    public ContaBanco(String dono,int num_conta){
        
        this.num_conta = num_conta;
        this.saldo = 0;
        this.status = false;
        this.dono = dono;
    }
    
    
    public void abrir_conta(String tipo){
        
        this.setTipo(tipo);
        
        if(tipo.contains("cc")  || tipo.contains("cp") ){
            System.out.println(" tipo de conta valida");
        }else{
            System.out.println(" tipo de conta invalida");
        }
        
        this.setStatus(true);
        
        if(tipo.contains("cp")){
            this.saldo = 150;
        }else{
            this.saldo = 50;
        }
        
    }
    
    
    public void fechar_conta(){
        
        if(this.saldo > 0){
            System.out.println(" só é possivel fechar a conta se o seu saldo for 0");
        }
        if (this.saldo == 0){
            System.out.println(" sua conta esta sendo fechada...");
            this.status = false;
        }
        if (this.saldo < 0){
            System.out.println(" não é possivel fechar a conta se seu saldo for negativo");
        }
        
    }
    
    public void depositar(double valor){
        
        if (!this.status){
            System.out.println("impossivel depositar, conta esta fechada!");
            return;
        }
        
        this.saldo += valor;
        
    }
    
    public void sacar (double valor){
        
        
        if (!this.status){
            System.out.println("impossivel sacar, conta esta fechada!");
            return;
        }
        
        if(valor > this.saldo){
            System.out.println("valor indisponivel na conta!");
            return;
        } 
        
        
        this.saldo -= valor;
    }
    
    public void pagarMensal (){
        
        if (!this.status){
            System.out.println("impossivel pagar mensalidade, conta esta fechada!");
            return;
        }
       
        if(this.tipo.contains("cc")){
            this.saldo -= 12;
        }else{
            this.saldo -= 20;
        }
        
        if(this.saldo < 0){
            System.out.println("a sua conta esta negativada!");
        }
        
        
        
    }
    
    
    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public  boolean getStatus(){
        return status;
    }
     private void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
