//PASO 4
package com.castillo.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//Activar WebMvc
@EnableWebMvc

//Activar para configuracion. A quien inyectar independencias
@Configuration

//De donde escaneara las configuraciones
@ComponentScan("com.castillo.web")

public class WebAppConfig extends WebMvcConfigurerAdapter{
    
    
    
}
