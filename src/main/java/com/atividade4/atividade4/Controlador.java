package com.atividade4.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

    @RequestMapping("/")
    String inicio(){
        System.out.println("---------passei aqui");
        return "home";
    }
    
}
