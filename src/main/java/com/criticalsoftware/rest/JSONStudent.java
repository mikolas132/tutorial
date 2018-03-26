package com.criticalsoftware.rest;


import com.criticalsoftware.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jsonservices")
public class JSONStudent {

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student produceJSON( @PathParam("name") String name ) {
        Student st = new Student(2,name,"Diaz",22);
        return st;
    }
}
