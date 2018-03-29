package com.criticalsoftware.rest;


import com.criticalsoftware.Sum;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("calculator")

public class calculator {
    @POST
    @Path("simple")
    public String getResult(Sum sum){
        return sum.Result();
    }

    @POST
    @Path("simple1")
    public String getResultString(Sum sum){
        sum.Result();
        return sum.toString();
    }

    @GET
    @Path("param/{username}")
    public String getParam(@PathParam("username") String userName){
        return "username " + userName;
    }

    @GET
    @Path("param1/{username: [A-Z][a-z]*}")
    public String getParam1(@PathParam("username") String userName){
        return "username " + userName;
    }
}


