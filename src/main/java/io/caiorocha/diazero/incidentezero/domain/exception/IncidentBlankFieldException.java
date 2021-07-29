package io.caiorocha.diazero.incidentezero.domain.exception;

public class IncidentBlankFieldException extends RuntimeException {

    public IncidentBlankFieldException() {
        super("Um dos campos devem ser preenchidos.");
    }

}
