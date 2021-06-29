package com.robinfood.encuesta.service;

import com.robinfood.encuesta.entity.EncuestaResuelta;
import com.robinfood.encuesta.repository.EncuestaResueltaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncuestaResueltaService {

    @Autowired
    EncuestaResueltaRepository encuestaResueltaRepository;

    public List<EncuestaResuelta> saveAll(List<EncuestaResuelta> encuestaResueltaList){
        return encuestaResueltaRepository.saveAll(encuestaResueltaList);
    }
}
