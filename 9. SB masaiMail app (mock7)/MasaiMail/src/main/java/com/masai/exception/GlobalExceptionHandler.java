package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(UserException ex , WebRequest wb){
		ErrorDetails ed = new ErrorDetails(ex.getMessage(), wb.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> exceptionHandler(Exception ex , WebRequest wb){
		ErrorDetails ed = new ErrorDetails(ex.getMessage(), wb.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<>(ed, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MailException.class)
	public ResponseEntity<ErrorDetails> productExceptionHandler(MailException ex , WebRequest wb){
		ErrorDetails ed = new ErrorDetails(ex.getMessage(), wb.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<>(ed, HttpStatus.BAD_REQUEST);
	}

}
