package com.dfguerrero.backend.backend.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfguerrero.backend.backend.convertidores.ConvertidorPartido;
import com.dfguerrero.backend.backend.dto.PartidoDTO;
import com.dfguerrero.backend.backend.repositorios.RepositorioPartido;

@Service
public class ServicioPartido {
    
    @Autowired
    private RepositorioPartido repositorioPartido;

    private ConvertidorPartido convertidorPartido = new ConvertidorPartido();

    public List<PartidoDTO> listar(){
        return convertidorPartido.aDTO(repositorioPartido.findAll());
    }
    public PartidoDTO guardar(PartidoDTO partido){
        return convertidorPartido.aDTO(repositorioPartido.save(convertidorPartido.aEntidad(partido)));
    }
}
