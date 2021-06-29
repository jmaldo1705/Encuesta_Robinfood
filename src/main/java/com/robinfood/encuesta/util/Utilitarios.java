package com.robinfood.encuesta.util;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Component
public class Utilitarios {
    public String getProperties(String nombreProperties, String nombrePropiedad) throws IOException {
        Properties prop = new Properties();
        String archivoProperties = nombreProperties + ".properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(archivoProperties);
        if (inputStream != null){
            prop.load(inputStream);
        }else{
            throw new FileNotFoundException("archivo properties '" + archivoProperties + "' no encontrado en el classpath");
        }
        return prop.getProperty(nombrePropiedad);
    }
}
