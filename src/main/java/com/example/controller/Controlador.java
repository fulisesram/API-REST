package com.example.controller;

import com.example.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.service.IPersonaServ;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller -> MVC
@RestController // -> REST
public class Controlador {

    /** 1. Inyectamos la interface IPersonaServ(Capa Logica)
     *  2. Separar la capa de datos, ahora el controlador ya no usara directamente la capa de datos,
     *     se esta  usando la capa de servicio interfaz IPersonaServ que a su vez implementa PersonaServImpl  */

    @Autowired
    @Qualifier("personaServImpl")
    private IPersonaServ personaServ;

    @GetMapping(path ="/listado", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Persona> listado (){
        List<Persona> personas =  personaServ.listaPersona();
        return personas;
    }




}

