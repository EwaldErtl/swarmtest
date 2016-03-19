/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartter.ewer.swarmtest.intro.boundary;

import com.hartter.ewer.swarmtest.intro.entitiy.Person;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author eertl
 */
@Path("resource")
public class PersonResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
    }

    /**
     * Retrieves representation of an instance of com.hartter.ewer.swarmtest.intro.PersonResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public List<Person> geAllPersons() {
        
        Person[] p = new Person[5];
        String[] pNames = { "one", "two", "three", "four", "five" };
        
        for(int i=0;i<5;i++) {
            Calendar cal = Calendar.getInstance();
            cal.set(1970+i, i, i);
            p[i] = new Person(pNames[i], pNames[i], cal );
        }
        
        return Arrays.asList(p);
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
