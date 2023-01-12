package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> handlefirException(UserException exception, WebRequest wreq) {
		ErrorDetails err = new ErrorDetails();
		err.setDate(LocalDateTime.now());
		err.setMessage(exception.getMessage());
		err.setDetails(wreq.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}  
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetails> handleuserException(UserException exception, WebRequest wreq) {
		ErrorDetails err = new ErrorDetails();
		err.setDate(LocalDateTime.now());
		err.setMessage(exception.getMessage());
		err.setDetails(wreq.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorDetails> handleIllegalArgumentException(IllegalArgumentException exception,
			WebRequest wreq) {
		ErrorDetails err = new ErrorDetails();
		err.setDate(LocalDateTime.now());
		err.setMessage(exception.getMessage());
		err.setDetails(wreq.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> handleMethodArgumentNotValidException(
			MethodArgumentNotValidException exception) {
		ErrorDetails err = new ErrorDetails();
		err.setDate(LocalDateTime.now());
		err.setMessage("invalid argument");
		err.setDetails(exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> handleNoHandlerFoundException(NoHandlerFoundException exception,
			WebRequest wreq) {
		ErrorDetails err = new ErrorDetails();
		err.setDate(LocalDateTime.now());
		err.setMessage(exception.getMessage());
		err.setDetails(wreq.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception exception, WebRequest wreq) {
		ErrorDetails err = new ErrorDetails();
		err.setDate(LocalDateTime.now());
		err.setMessage(exception.getMessage());
		err.setDetails(wreq.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

}
