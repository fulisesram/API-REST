package com.example.service;

import com.example.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.repository.IPersonaJPA;
import java.util.List;

@Service
@Component
public class PersonaServImpl implements IPersonaServ{

    /** Inyectamos la interface IPersonaJPA que extiende de JpaRepository para usar sus metodos pre-definidos */
// ----- Campo de clase -----
    @Autowired
    private IPersonaJPA personaJPA;

// ----- Constructor -----
//    private IPersonaJPA personaJPA;
//    @Autowired
//    public PersonaServImpl(IPersonaJPA personaJPA) {
//        this.personaJPA = personaJPA;
//    }
// ----- Setter -----
//      private IPersonaJPA personaJPA;
//      @Autowired
//      public void setPersonaJPA(IPersonaJPA personaJPA) {
//      this.personaJPA = personaJPA;
//    }

    /** Implementaciones de los metodos de IpersonaServ */
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersona() {
        return personaJPA.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaJPA.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaJPA.delete(persona);
    }

    /** El siguiente metodo devuelve un optional(que hacer si el objeto es null) por lo que podemos indicar null en caso de no encontrar el objeto o usar algun otro metodo */
    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaJPA.findById(persona.getIdPersona()).orElse(null);
    }

    @Override
    public String getAlgunMetodo() {
        return "PersonaServImpl";
    }

}

/** La anotacion transactional permite hacer commit o rolback, al indicar readOnly=true indicamos que solo es consulta*/