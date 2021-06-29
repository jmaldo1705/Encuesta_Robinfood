package com.robinfood.encuesta.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;

    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;

    @JoinTable(
            name = "preguntas_respuestas",
            joinColumns = @JoinColumn(name = "FK_PREGUNTA", nullable = false, referencedColumnName = "idPregunta", foreignKey = @ForeignKey(name = "FK_pregunta_respuesta")),
            inverseJoinColumns = @JoinColumn(name="FK_RESPUESTA", nullable = false, referencedColumnName = "idRespuesta", foreignKey = @ForeignKey(name = "FK_respuesta_pregunta"))
    )

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Respuesta> respuestas;
}
