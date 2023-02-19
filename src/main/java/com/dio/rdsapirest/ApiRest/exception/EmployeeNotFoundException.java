package com.dio.rdsapirest.ApiRest.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(long id) {
        super("Could not find the id: " + id);
    }
}
