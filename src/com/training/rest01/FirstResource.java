package com.training.rest01;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/first")
public class FirstResource {
	
	@Path("/message")
	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public String getMessage(){
		return "<html><body><h1>Welcome To First rest Resource</h1></body></html>";
	}
	
	@Path("/message2")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getMessage2(){
		return "<html><body><h1>Welcome To First rest Resource</h1></body></html>";
	}
	
//	@Path("/message3")
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public Customer getMessage3(){
//		return new Customer(1, "Tauqeer", "India");
//	}

}
