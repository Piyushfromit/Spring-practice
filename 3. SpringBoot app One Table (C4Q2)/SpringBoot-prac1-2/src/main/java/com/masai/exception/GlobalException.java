package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(AccountException.class)
	public ResponseEntity<String> productException(AccountException p){
		
		return new ResponseEntity<String>(p.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> myMANVExceptionHandler(MethodArgumentNotValidException me,WebRequest req) {
		
		
	   return new ResponseEntity<>(me.getMessage(),HttpStatus.BAD_REQUEST);
	   
	}

}
