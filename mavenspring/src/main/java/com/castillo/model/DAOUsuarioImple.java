/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castillo.model;

import java.util.ArrayList;


public class DAOUsuarioImple {
    public static ArrayList<Usuario> Implementar(){
        ArrayList<Usuario> lista= new ArrayList<Usuario>();
        
        Usuario un;
        un =new Usuario("jcampitos","hhh", "js");
        lista.add(un);
        
      
        un =new Usuario("demian","asad", "ds");
        lista.add(un);
        
      
        un =new Usuario("dsfd","dfh", "bg");
        lista.add(un);
        
    return lista;
        
    }
    
    
}
