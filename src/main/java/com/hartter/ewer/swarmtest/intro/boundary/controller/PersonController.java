/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartter.ewer.swarmtest.intro.boundary.controller;

import com.hartter.ewer.swarmtest.intro.entitiy.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eertl
 */

public class PersonController {        
        
    @PersistenceContext(unitName = "swarmPU")
    EntityManager em; 
    
    
    public List<Person> getAllPersons() {       
        return em.createNamedQuery(Person.FINDALL).getResultList();
    }
    
    public void putPerson(Person p) {
        em.merge(p);
    }
}
