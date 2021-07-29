package io.caiorocha.diazero.incidentezero.adapter.repository;

import io.caiorocha.diazero.incidentezero.adapter.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {
}
