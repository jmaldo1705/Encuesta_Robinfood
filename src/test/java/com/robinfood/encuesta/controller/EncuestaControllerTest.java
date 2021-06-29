package com.robinfood.encuesta.controller;

import com.robinfood.encuesta.dto.EncuestaDTO;
import com.robinfood.encuesta.dto.EncuestaRequestDTO;
import com.robinfood.encuesta.dto.ResponseDTO;
import com.robinfood.encuesta.dto.RespuestaClienteDTO;
import com.robinfood.encuesta.entity.Encuesta;
import com.robinfood.encuesta.entity.EncuestaResuelta;
import com.robinfood.encuesta.entity.Pregunta;
import com.robinfood.encuesta.entity.Respuesta;
import com.robinfood.encuesta.service.EncuestaResueltaService;
import com.robinfood.encuesta.service.EncuestaService;
import com.robinfood.encuesta.util.Utilitarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.sql.Array;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class EncuestaControllerTest {

    @Autowired
    EncuestaService encuestaServiceMock = Mockito.mock(EncuestaService.class);

    @Autowired
    EncuestaResueltaService encuestaResueltaServiceMock = Mockito.mock(EncuestaResueltaService.class);

    @Autowired
    EncuestaController encuestaController = new EncuestaController(encuestaServiceMock, encuestaResueltaServiceMock, new ModelMapper(), new Utilitarios());

    @BeforeEach
    void setUp() {
        Respuesta respuesta = new Respuesta();
        respuesta.setIdRespuesta(1);
        respuesta.setNombre("Sí");
        List<Respuesta> listaRespuestas = new ArrayList<>();
        listaRespuestas.add(respuesta);
        respuesta = new Respuesta();
        respuesta.setIdRespuesta(2);
        respuesta.setNombre("No");
        listaRespuestas.add(respuesta);
        Pregunta pregunta = new Pregunta();
        pregunta.setIdPregunta(3);
        pregunta.setNombre("¿Ha sido la primera vez en nuestro restaurante?");
        pregunta.setRespuestas(listaRespuestas);
        List<Pregunta> listaPreguntas = new ArrayList<>();
        listaPreguntas.add(pregunta);
        Encuesta encuesta = new Encuesta();
        encuesta.setIdEncuesta(1);
        encuesta.setNombre("Encuesta general");
        encuesta.setPreguntas(listaPreguntas);
        List<Encuesta> listaEncuesta = new ArrayList<>();
        listaEncuesta.add(encuesta);
        List<EncuestaResuelta> listaEncuestaResuelta = new ArrayList<>();
        EncuestaResuelta encuestaResuelta = new EncuestaResuelta();
        encuestaResuelta.setIdEncuestaResuelta(1);
        encuestaResuelta.setEncuesta(encuesta);
        encuestaResuelta.setIdPregunta(1);
        encuestaResuelta.setIdRespuesta(1);
        listaEncuestaResuelta.add(encuestaResuelta);
        Mockito.when(encuestaResueltaServiceMock.saveAll(listaEncuestaResuelta)).thenReturn(listaEncuestaResuelta);
        Mockito.when(encuestaServiceMock.listaEncuestas()).thenReturn(listaEncuesta);
        Mockito.when(encuestaServiceMock.existsById(1)).thenReturn(true);
        Mockito.when(encuestaServiceMock.existsById(2)).thenReturn(false);
        Mockito.when(encuestaServiceMock.findById(1)).thenReturn(Optional.of(encuesta));
    }

    @Test
    void listaEncuestas() {
        ResponseEntity<List<EncuestaDTO>> respuestaServicio = encuestaController.listaEncuestas();
        for(EncuestaDTO enc: Objects.requireNonNull(respuestaServicio.getBody())){
            Assertions.assertEquals(1, enc.getIdEncuesta());
            Assertions.assertEquals("Encuesta general", enc.getNombre());
        }
    }

    @Test
    void listaEncuestaPreguntasSuccess() {
        ResponseEntity<Encuesta> respuestaServicio = encuestaController.listaEncuestaPreguntas(1);
        Assertions.assertEquals(1, Objects.requireNonNull(respuestaServicio.getBody()).getIdEncuesta());
        Assertions.assertEquals("Encuesta general", Objects.requireNonNull(respuestaServicio.getBody()).getNombre());
    }

    @Test
    void listaEncuestaPreguntasFail() {
        ResponseEntity<Encuesta> respuestaServicio = encuestaController.listaEncuestaPreguntas(2);
        Assertions.assertEquals(HttpStatus.NOT_FOUND, respuestaServicio.getStatusCode());
    }

    @Test
    void guardaRespuestas() throws IOException {
        EncuestaRequestDTO encuestaRequestDTO = new EncuestaRequestDTO();
        RespuestaClienteDTO respuestaClienteDTO = new RespuestaClienteDTO();
        List<RespuestaClienteDTO> listaRespuestaClienteDTO = new ArrayList<>();
        respuestaClienteDTO.setIdPregunta(1);
        respuestaClienteDTO.setIdRespuesta(1);
        listaRespuestaClienteDTO.add(respuestaClienteDTO);
        encuestaRequestDTO.setIdEncuesta(1);
        encuestaRequestDTO.setRespuestasEnviadas(listaRespuestaClienteDTO);

        ResponseEntity<ResponseDTO> respuestaServicio = encuestaController.guardaRespuestas(encuestaRequestDTO);
        Assertions.assertEquals(HttpStatus.CREATED.value(), Objects.requireNonNull(respuestaServicio.getBody()).getCodigoRespuesta());
        Assertions.assertEquals("Se ha creado el registro satisfactoriamente", Objects.requireNonNull(respuestaServicio.getBody()).getMensajeRespuesta());
    }

    @Test
    void guardaRespuestasCatch() throws IOException {
        EncuestaRequestDTO encuestaRequestDTO = new EncuestaRequestDTO();
        ResponseEntity<ResponseDTO> respuestaServicio = encuestaController.guardaRespuestas(encuestaRequestDTO);
        Assertions.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, respuestaServicio.getStatusCode());
    }
}