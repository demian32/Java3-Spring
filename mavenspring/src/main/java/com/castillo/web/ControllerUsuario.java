/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castillo.web;

import com.castillo.model.DAOUsuarioImple;
import com.castillo.model.Usuario;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */
@Controller
@RequestMapping("/servicio-usuario")
public class ControllerUsuario {
    
    
 @RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=text/html"))   
 
 public @ResponseBody String BuscarTodos(){
 String mensajito="probando el metodo get para enviar todos los usuarios";
 return mensajito;
 }
 
 @RequestMapping(value="servicios/usuarios", method=RequestMethod.GET, headers=("Accept=Application/json"))
@ResponseBody String mijason(){
    ObjectMapper mapeadorjson=new ObjectMapper();
    return null;
}

@RequestMapping(value="/arreglo", method=RequestMethod.GET, headers=("Accept=Application/json"))
@ResponseBody ArrayList<Usuario> ete(){
    return DAOUsuarioImple.Implementar();
} 
}
