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
import java.time.LocalDateTime;

public class RelacionamentoClasse {
   
    
    public static void main(String[] args){
        
       // crinado objetos de diversas classes e mostrando suas relações com o sout
       PerfilUsuario perfilAdmin = new PerfilUsuario(01,"administrador");
       PerfilUsuario perfilUser = new PerfilUsuario(02,"usuario");
      
       perfilAdmin.adicionarPermissao("Adicionar Usuarios");
       perfilAdmin.adicionarPermissao("Excluir usuarios");
       
       perfilUser.adicionarPermissao("Criar Posts");
       
       
       
       Usuario usuario = new Usuario(01,perfilAdmin,"Ian Lucas","ian@gmail.com","ian1234");
       
       Usuario usuario1 = new Usuario(02,perfilUser,"Nate ","Phelfrtizl@gmail.com","1234");
       
       
       
        System.out.println(" " +usuario.toString());
        System.out.println(" " +usuario1.toString());
        
        System.out.println(" "+perfilAdmin.ToString());
               
        
        
        Sessao sessao1 = new Sessao(01,usuario,"1225");
        System.out.println(" "+ sessao1.ToString());
        
       LogAuditoria log1 = new LogAuditoria(01,usuario,"Criou conta , data:",LocalDateTime.now(),"1219021");
        System.out.println(" "+ log1.toString());
        
    }
    
    
    
    
    
    
}
