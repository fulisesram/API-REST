package com.example.controller;

import com.example.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.service.IPersonaServ;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class main {

//       @Autowired
//       @Qualifier("ImplementacionTestQualifier")
//       static IPersonaServ personaServ;

           public static void main(String[] args) {
               //String algo = personaServ.getAlgunMetodo();
               //System.out.println(algo);

               Set<Integer> integerSet = new HashSet<>();
               integerSet.add(1);
               integerSet.add(2);
               integerSet.add(3);
               
               Set<Integer> inmutableSet = integerSet.
                       stream().collect(collectingAndThen(
                               toSet(), Collections::unmodifiableSet));

               System.out.println("inmutableSet = " + inmutableSet);

               integerSet.add(4);

               System.out.println("inmutableSet = " + inmutableSet);


    }
}
