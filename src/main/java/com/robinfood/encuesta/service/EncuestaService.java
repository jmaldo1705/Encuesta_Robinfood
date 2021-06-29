package com.robinfood.encuesta.service;

import com.robinfood.encuesta.entity.Encuesta;
import com.robinfood.encuesta.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncuestaService {

    @Autowired
    EncuestaRepository encuestaRepository;

    public List<Encuesta> listaEncuestas(){
        return encuestaRepository.findAll();
    }

    public Optional<Encuesta> findById(int id){
        return encuestaRepository.findById(id);
    }

    public boolean existsById(int id){
        return encuestaRepository.existsById(id);
    }
}
