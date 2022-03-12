package com.example.repository;

import com.example.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface IPersonaJPA extends JpaRepository<Persona, Long> {

    //Persona findByNombre(String nombre);

}
