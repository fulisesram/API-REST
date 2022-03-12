package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.service.IPersonaServ;

public class main {

       @Autowired
       @Qualifier("ImplementacionTestQualifier")
       static IPersonaServ personaServ;

           public static void main(String[] args) {

               String algo = personaServ.getAlgunMetodo();

               System.out.println(algo);

    }
}
