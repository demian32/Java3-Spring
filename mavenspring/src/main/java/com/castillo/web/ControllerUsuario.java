/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castillo.web;

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
}
