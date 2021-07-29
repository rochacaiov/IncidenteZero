package io.caiorocha.diazero.incidentezero.adapter.mapper;

import io.caiorocha.diazero.incidentezero.adapter.model.Incident;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentCreateDTO;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentResponseDTO;

import java.time.LocalDateTime;

public class IncidentMapper {

    public static IncidentResponseDTO from(Incident incident) {
        return IncidentResponseDTO.builder()
                .id(incident.getIdIncident())
                .name(incident.getName())
                .description(incident.getDescription())
                .createdAt(incident.getCreatedAt())
                .updatedAt(incident.getUpdatedAt())
                .closedAt(incident.getClosedAt())
                .build();
    }

    public static Incident to(IncidentCreateDTO createDTO) {
        return Incident.builder()
                .name(createDTO.getName())
                .description(createDTO.getDescription())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .closedAt(null)
                .build();
    }

}
