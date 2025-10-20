/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author ianep
 */


import java.util.ArrayList;
import java.util.List;

public class PerfilUsuario {
    
    private long id;
    private String descricao;
    private List<String> permissoes;
    
    public PerfilUsuario(long id, String descricao){
        
        this.id = id;
        this.descricao = descricao;
        this.permissoes = new ArrayList<>();
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<String> pegarPermissão(){
        return this.permissoes;
       
    }
    
    
    
    public void adicionarPermissao(String permissao){
        
        if (permissao != null && !this.permissoes.contains(permissao)) {
            this.permissoes.add(permissao);
           }
    
    }
    
    public String ToString(){
        
        return "id:  "+ id + " perfil de :" + this.descricao + " premissoes: " + permissoes;
    }
    
    }
    
    
    
    