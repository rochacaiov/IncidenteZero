package io.caiorocha.diazero.incidentezero.domain.exception;

public class IncidentNotFoundException extends RuntimeException {

    public IncidentNotFoundException(Long id) {
        super(String.format("Usuário com id %d não encontrado.", id));
    }

}
