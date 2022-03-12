package com.example.service;

import com.example.entity.Persona;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ImplementacionTestQualifier implements IPersonaServ{

    @Override
    public List<Persona> listaPersona() {
        return null;
    }

    @Override
    public void guardar(Persona persona) {

    }

    @Override
    public void eliminar(Persona persona) {

    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        return null;
    }

    @Override
    public String getAlgunMetodo() {
        return "Metodo ImplementacionTestQualifier";
    }
}
