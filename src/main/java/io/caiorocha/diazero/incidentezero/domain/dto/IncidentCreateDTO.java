package io.caiorocha.diazero.incidentezero.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class IncidentCreateDTO {

    @NotNull
    private final String name;
    @NotNull
    private final String description;

}
