package com.robinfood.encuesta.controller;

import com.robinfood.encuesta.dto.EncuestaDTO;
import com.robinfood.encuesta.dto.EncuestaRequestDTO;
import com.robinfood.encuesta.dto.ResponseDTO;
import com.robinfood.encuesta.dto.RespuestaClienteDTO;
import com.robinfood.encuesta.entity.Encuesta;
import com.robinfood.encuesta.entity.EncuestaResuelta;
import com.robinfood.encuesta.service.EncuestaResueltaService;
import com.robinfood.encuesta.service.EncuestaService;
import com.robinfood.encuesta.util.Utilitarios;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encuesta")
@CrossOrigin(origins = "*")
public class EncuestaController {

    @Autowired
    EncuestaService encuestaService;

    @Autowired
    EncuestaResueltaService encuestaResueltaService;

    @Autowired
    Utilitarios util;

    @Autowired
    ModelMapper modelMapper;

    public EncuestaController(EncuestaService encuestaService, EncuestaResueltaService encuestaResueltaService, ModelMapper modelMapper, Utilitarios util){
        this.encuestaService = encuestaService;
        this.encuestaResueltaService = encuestaResueltaService;
        this.modelMapper = modelMapper;
        this.util = util;
    }

    @GetMapping("/listaEncuestas")
    public ResponseEntity<List<EncuestaDTO>> listaEncuestas(){
        List<Encuesta> list = encuestaService.listaEncuestas();
        List<EncuestaDTO> listaEncuesta = new ArrayList<>();
        for(Encuesta encuesta: list){
            listaEncuesta.add(modelMapper.map(encuesta, EncuestaDTO.class));
        }
        return new ResponseEntity<>(listaEncuesta, HttpStatus.OK);
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<Encuesta> listaEncuestaPreguntas(@PathVariable("id") int id){
        if(!encuestaService.existsById(id))
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Encuesta encuesta = new Encuesta();
        Optional<Encuesta> encuestaOptional = encuestaService.findById(id);
        if(encuestaOptional.isPresent()){
            encuesta = encuestaOptional.get();
        }
        return new ResponseEntity<>(encuesta, HttpStatus.OK);
    }

    @PostMapping("/guardaRespuestas")
    public ResponseEntity<ResponseDTO> guardaRespuestas(@RequestBody EncuestaRequestDTO encuestaRequestDTO) throws IOException {
        ResponseDTO responseDTO = new ResponseDTO();
        try {
            EncuestaResuelta encuestaResuelta;
            Encuesta encuesta = new Encuesta();
            encuesta.setIdEncuesta(encuestaRequestDTO.getIdEncuesta());
            List<EncuestaResuelta> listaEncuestaResuelta = new ArrayList<>();
            for (RespuestaClienteDTO respuestaClienteDTO : encuestaRequestDTO.getRespuestasEnviadas()) {
                encuestaResuelta = new EncuestaResuelta();
                encuestaResuelta.setIdPregunta(respuestaClienteDTO.getIdPregunta());
                encuestaResuelta.setIdRespuesta(respuestaClienteDTO.getIdRespuesta());
                encuestaResuelta.setEncuesta(encuesta);
                listaEncuestaResuelta.add(encuestaResuelta);
            }
            encuestaResueltaService.saveAll(listaEncuestaResuelta);
            responseDTO.setCodigoRespuesta(HttpStatus.CREATED.value());
            responseDTO.setMensajeRespuesta(util.getProperties("mensajesRespuesta", "insert.ok"));
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }catch(Exception e){
            responseDTO.setCodigoRespuesta(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseDTO.setMensajeRespuesta(util.getProperties("mensajesRespuesta", "insert.error"));
            return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
