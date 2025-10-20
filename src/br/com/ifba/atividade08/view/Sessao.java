/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author ianep
 */
public class Sessao {
    
    private long id;
    private Usuario usuario;
    private String token;

    public Sessao(long id, Usuario usuario,String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public String ToString(){
        
        return "Sessão iniciada, Usuario: "+ usuario.getNomeUsuario() + " token da sessão :" +token;
                
    }
    
}
