package com.oak.users.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		Map<String,String> errors=new HashMap<String, String>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			errors.put(((FieldError) error).getField(),((FieldError) error).getDefaultMessage());
		});
		return new ResponseEntity<Map<String,String>>(errors,HttpStatus.BAD_REQUEST);
	}
}
