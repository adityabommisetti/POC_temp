package com.dbs.exception.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dbs.exception.ApplicationException;
import com.dbs.helper.JSONResponse;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(value = ApplicationException.class)
	public ResponseEntity<?> handleException(ApplicationException exception) {
		JSONResponse jsonResponse = new JSONResponse();
		jsonResponse.setStatus("FAILURE");
		jsonResponse.setMessage(exception.getMessage());
		jsonResponse.setData(null);
		return new ResponseEntity<>(jsonResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
