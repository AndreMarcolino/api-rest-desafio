package com.andremarcolino.apirestmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.andremarcolino.apirestmongo.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourcesExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {

		
		HttpStatus status = HttpStatus.NOT_FOUND;

		StandartError err = new StandartError(System.currentTimeMillis(), status.value(), "Não encontrado", ex.getMessage(), request.getRequestURI());

		return ResponseEntity.status(status).body(err);

	}
}