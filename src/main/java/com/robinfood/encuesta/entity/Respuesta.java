package com.robinfood.encuesta.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;

    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;
}
