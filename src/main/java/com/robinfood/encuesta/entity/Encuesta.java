package com.robinfood.encuesta.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "encuestas")
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEncuesta;

    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "encuestas_preguntas",
            joinColumns = @JoinColumn(name = "FK_ENCUESTA", nullable = false, referencedColumnName = "idEncuesta", foreignKey = @ForeignKey(name = "FK_encuesta_pregunta")),
            inverseJoinColumns = @JoinColumn(name="FK_PREGUNTA", nullable = false, referencedColumnName = "idPregunta", foreignKey = @ForeignKey(name = "FK_pregunta_encuesta"))
    )
    private List<Pregunta> preguntas;
}
