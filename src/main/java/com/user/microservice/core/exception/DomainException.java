package com.user.microservice.core.exception;

public class DomainException extends RuntimeException {

    public DomainException(final String message) {
      super(message);
    }
}
