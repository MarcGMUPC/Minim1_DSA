package edu.upc.dsa.services;

import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/users", description = "Endpoint to Track Service")
@Path("/users")

public class UsersService {

    private Covid19Manager cm;

    public UsersService() {
        this.cm = Covid19ManagerImpl.getInstance();
        if (cm.size()==0) {
            this.cm.addUser("Edgar", "1", "13/04/21","Bé");
            this.cm.addUser("Marc", "2","16/03/21 y 24/03/21","Malament");
            this.cm.addUser("Paula", "0", "Pendent", "Bé");
        }


    }

    @GET
    @ApiOperation(value = "Obté tots els usuaris", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = User.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {

        List<User> users = this.cm.findAll();

        GenericEntity<List<User>> entity = new GenericEntity<List<User>>(users) {};
        return Response.status(201).entity(entity).build()  ;

    }

    @GET
    @ApiOperation(value = "Obté un usuari", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = User.class),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrack(@PathParam("id") String id) {
        User u = this.cm.getUser(id);
        if (u == null) return Response.status(404).build();
        else  return Response.status(201).entity(u).build();
    }

    @DELETE
    @ApiOperation(value = "Borra un usuari", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{id}")
    public Response deleteUser(@PathParam("id") String id) {
        User u = this.cm.getUser(id);
        if (u == null) return Response.status(404).build();
        else this.cm.deleteUser(id);
        return Response.status(201).build();
    }
}
