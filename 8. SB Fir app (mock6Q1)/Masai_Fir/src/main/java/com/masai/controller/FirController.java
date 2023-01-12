package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Fir;
import com.masai.exception.FirException;
import com.masai.service.FirService;

@RestController
public class FirController {

	
	@Autowired
	private FirService fs;
	
	
	
	@PostMapping("/fir{id}")
	public ResponseEntity<Fir> addfir( @PathVariable("id") Integer u_id,@RequestBody Fir fir) {
		
		return new ResponseEntity<Fir>(fs.addfir(u_id, fir), HttpStatus.ACCEPTED);
		
	}
	
}
