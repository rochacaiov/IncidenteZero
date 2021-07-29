package io.caiorocha.diazero.incidentezero.adapter.controller;

import io.caiorocha.diazero.incidentezero.domain.dto.IncidentCreateDTO;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentResponseDTO;
import io.caiorocha.diazero.incidentezero.domain.dto.IncidentUpdateDTO;
import io.caiorocha.diazero.incidentezero.service.IncidentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
@RequestMapping("incidents")
public class IncidentController {

    @Autowired
    private final IncidentService incidentService;

    @PostMapping(consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<IncidentResponseDTO> create(@Valid @RequestBody IncidentCreateDTO createDTO) {
        final var createdIncident = incidentService.create(createDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdIncident);
    }

    @PutMapping(value = "/{id}", consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<IncidentResponseDTO> update(@PathVariable("id") @NotBlank Long id, @Valid @RequestBody IncidentUpdateDTO updateDTO) {
        updateDTO.setId(id);
        final var updatedIncident = incidentService.update(updateDTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(updatedIncident);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<IncidentResponseDTO> delete(@PathVariable("id") @NotBlank Long id) {
        final var deletedIncident = incidentService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(deletedIncident);
    }

}
