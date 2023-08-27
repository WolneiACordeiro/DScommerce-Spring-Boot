package com.devsuperior.dscommerce.services.exceptios;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg){
        super(msg);
    }
}
