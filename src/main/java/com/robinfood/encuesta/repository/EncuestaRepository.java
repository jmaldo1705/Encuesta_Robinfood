package com.robinfood.encuesta.repository;

import com.robinfood.encuesta.entity.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncuestaRepository extends JpaRepository<Encuesta, Integer> {
}
