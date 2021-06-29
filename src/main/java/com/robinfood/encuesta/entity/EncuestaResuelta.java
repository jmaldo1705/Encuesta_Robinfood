package com.robinfood.encuesta.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "encuestas_resueltas")
public class EncuestaResuelta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuestaResuelta;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_encuesta", foreignKey = @ForeignKey(name = "FK_encuesta_encuesta_resuelta"))
    private Encuesta encuesta;

    private int idPregunta;

    private int idRespuesta;
}
