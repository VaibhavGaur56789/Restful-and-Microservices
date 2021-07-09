package com.ltts.democlient.IPL.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalController {
	
	//@Autowired
	//RestTemplate rt;
	
	@RequestMapping("/getPlayers")
	public ResponseEntity<String> getPlayers() {
		
		RestTemplate rt=new RestTemplate();
		
		  HttpHeaders headers = new HttpHeaders();
		  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		  HttpEntity<String> entity = new HttpEntity<String>(headers);
		  
		  ResponseEntity<String> response =rt.exchange("http://PLAYER-SERVICE/players", HttpMethod.GET, entity,String.class);
		 		     
	   // String result = rt.getForObject("http://localhost:8080/players", String.class);
		    //rt.getForEntity(null, null)
	    System.out.println(response);
	    return response;
	}

}
