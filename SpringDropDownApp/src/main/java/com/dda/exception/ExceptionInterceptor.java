package com.dda.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class ExceptionInterceptor extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(DropDownAppException.class)
	  public final ResponseEntity<Object> handleAllExceptions(DropDownAppException e) {
	    return ResponseEntity.status(e.getCode()).body(e.getMessage());
	  }

}
