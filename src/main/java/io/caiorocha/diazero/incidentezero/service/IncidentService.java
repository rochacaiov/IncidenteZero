package io.caiorocha.diazero.incidentezero.service;

import io.caiorocha.diazero.incidentezero.adapter.mapper.IncidentMapper;
import io.caiorocha.diazero.incidentezero.adapter.repository.IncidentRepository;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentCreateDTO;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentResponseDTO;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentUpdateDTO;
import io.caiorocha.diazero.incidentezero.domain.exception.IncidentBlankFieldException;
import io.caiorocha.diazero.incidentezero.domain.exception.IncidentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    public IncidentResponseDTO create(IncidentCreateDTO createDTO) {
        final var incident = incidentRepository.save(IncidentMapper.to(createDTO));
        return IncidentMapper.from(incident);
    }

    public IncidentResponseDTO update(IncidentUpdateDTO updateDTO) {
        final var id = updateDTO.getId();
        final var name = updateDTO.getName();
        final var description = updateDTO.getDescription();
        final var incident = incidentRepository.findById(id)
                .orElseThrow(() -> new IncidentNotFoundException(id));

        if (name.isBlank() && description.isBlank()) {
            throw new IncidentBlankFieldException();
        }

        if (!name.isBlank()) {
            incident.setName(name);
        }

        if (!description.isBlank()) {
            incident.setDescription(description);
        }

        incident.setUpdatedAt(LocalDateTime.now());
        final var updatedIncident = incidentRepository.save(incident);
        return IncidentMapper.from(updatedIncident);
    }

    public IncidentResponseDTO delete(Long id) {
        final var incident = incidentRepository.findById(id)
                .orElseThrow(() -> new IncidentNotFoundException(id));
        incidentRepository.delete(incident);
        incident.setClosedAt(LocalDateTime.now());
        return IncidentMapper.from(incident);
    }

    public IncidentResponseDTO findById(Long id) {
        final var incident = incidentRepository.findById(id)
                .orElseThrow(() -> new IncidentNotFoundException(id));
        return IncidentMapper.from(incident);
    }

}
