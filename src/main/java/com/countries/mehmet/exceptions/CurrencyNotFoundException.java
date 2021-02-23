package com.countries.mehmet.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CurrencyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 138291179741093790L;

	public CurrencyNotFoundException(String message) {
		super(message);
	}

}
