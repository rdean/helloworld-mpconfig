package com.deanthings.config.helloworld.util;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("greeting")
@ApplicationScoped
public class HelloWorldResource {
	@Inject @ConfigProperty(name="greeting.text")
	String greeting;	
	
	@PostConstruct
	public void init() {
		if (greeting == null) {
			System.out.println("No injection");
		}
	}

	@GET
	@Path("/injected")
	public String getGreeting() {
		if (greeting != null) {
			return greeting;
		}
		return "Hello, Non-Config World!";
	}
	
	@GET
	@Path("/lookup")
	public String getGreetingLookup() {
		String greeting = ConfigProvider.getConfig().getValue("greeting.text", String.class);
		if (greeting != null) {
			return greeting;
		}
		return "Hello, Non-Config World!";
	}
	
}
