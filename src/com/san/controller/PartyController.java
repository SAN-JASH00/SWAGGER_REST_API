package com.san.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.san.model.Party;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/Party")
@Api(value ="Party Details")
public class PartyController {
	
	@GET
	@Path("/get-party")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(produces="application/json", value = "Fetch Party details", httpMethod="GET", notes = "This service fetches Party details", response = Party.class)
	@ApiResponses(value = { @ApiResponse(code = 200,response = Party.class, message = "Successful operation"),@ApiResponse(code = 400, message = "Bad Request", response = Party.class), @ApiResponse(code = 422, message = "Invalid data", response = Party.class), @ApiResponse(code = 500, message = "Internal Server Error", response = Party.class) })
	public Response getPerson( 
			@ApiParam(value = "Party No") @QueryParam("partyNo") String partyNo )
	{
		Party p = new Party();
		p.setAge("99");
		p.setName("Dummy");
		p.setId(partyNo);
		
		return Response.status(Status.OK).entity(p).type(MediaType.APPLICATION_JSON).build();
		
		//return p;
		
		//return Response.status(Status.NOT_FOUND).entity(p).type(MediaType.APPLICATION_JSON).build();
		
	}
	
	
	@POST
	@Path("/create-party")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(produces="application/json", value = "Create Party details", httpMethod="POST", notes = "This service creates Party details", response = Party.class)
	@ApiResponses(value = { @ApiResponse(code = 200,response = Party.class, message = "Successful operation"),@ApiResponse(code = 400, message = "Bad Request", response = Party.class), @ApiResponse(code = 422, message = "Invalid data", response = Party.class), @ApiResponse(code = 500, message = "Internal Server Error", response = Party.class) })
	public Response createPerson(Party p)
	{
		//Party p = new Party();
		p.setAge("99");
		p.setName("Dummy");
		p.setId(p.getId());
		
		return Response.status(Status.OK).entity(p).type(MediaType.APPLICATION_JSON).build();
		
		//return p;
		
		//return Response.status(Status.NOT_FOUND).entity(p).type(MediaType.APPLICATION_JSON).build();
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update-party")
	@ApiOperation(produces="application/json", value = "Update Party details", httpMethod="PUT", notes = "This service Updates Party details", response = Party.class)
	@ApiResponses(value = { @ApiResponse(code = 200,response = Party.class, message = "Successful operation"),@ApiResponse(code = 400, message = "Bad Request", response = Party.class), @ApiResponse(code = 422, message = "Invalid data", response = Party.class), @ApiResponse(code = 500, message = "Internal Server Error", response = Party.class) })
	public Party updateStudent(@PathParam("age")String age ,Party party)
	{
		party.setAge(age);;
		return party;
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete-party")
	@ApiOperation(produces="application/json", value = "Delete Party details", httpMethod="DELETE", notes = "This service Deletes Party details", response = Party.class)
	@ApiResponses(value = { @ApiResponse(code = 200,response = Party.class, message = "Successful operation"),@ApiResponse(code = 400, message = "Bad Request", response = Party.class), @ApiResponse(code = 422, message = "Invalid data", response = Party.class), @ApiResponse(code = 500, message = "Internal Server Error", response = Party.class) })
	public String removeStudent(@PathParam("partyNo") String partyNo)
	{
		//return party.delete(party);
		Party p = new Party();
		p.setAge("99");
		p.setName("Dummy");
		p.setId(partyNo);
		return p.getId();
	}

}
