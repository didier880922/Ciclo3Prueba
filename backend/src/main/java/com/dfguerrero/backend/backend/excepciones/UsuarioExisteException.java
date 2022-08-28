package com.dfguerrero.backend.backend.excepciones;

public class UsuarioExisteException extends RuntimeException{

    public UsuarioExisteException() {
    }

    public UsuarioExisteException(String message) {
        super(message);
    }

    public UsuarioExisteException(Throwable cause) {
        super(cause);
    }

    public UsuarioExisteException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsuarioExisteException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}