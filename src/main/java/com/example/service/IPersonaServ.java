package com.example.service;

import com.example.entity.Persona;
import java.util.List;

public interface IPersonaServ {

    public List<Persona> listaPersona();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);

    public String getAlgunMetodo();


}
