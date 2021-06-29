package com.robinfood.encuesta.repository;

import com.robinfood.encuesta.entity.EncuestaResuelta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaResueltaRepository extends JpaRepository<EncuestaResuelta, Integer> {
}
