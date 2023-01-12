package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(StudentException ie,  WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		
		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
		 
		return re;
		
	}
	
	
	// it will handle All other Exception; 
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyExpHandler(Exception e, WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		ResponseEntity<MyErrorDetails> re = new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
		
		return re;
		
	}
	
	
	
	// it will handle Wrong URI or Wrong Method Exception; 
	
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> myNotFoundExpHandler(NoHandlerFoundException nfe, WebRequest req){
    	
    	MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
    	
    	return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    	
    	
    }
    
    
   // it will handle Invalid Data Exception; 
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MyErrorDetails> myInvalidDataExpHandler(MethodArgumentNotValidException me){
    	
         MyErrorDetails err = new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation Error");
		err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());
		 
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
    	
    }
    
    
    
    
    
    
    

}
