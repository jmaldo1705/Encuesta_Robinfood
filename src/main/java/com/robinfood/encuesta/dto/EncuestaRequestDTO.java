package com.robinfood.encuesta.dto;

import lombok.Data;

import java.util.List;

@Data
public class EncuestaRequestDTO {
    private int idEncuesta;
    private List<RespuestaClienteDTO> respuestasEnviadas;
}
