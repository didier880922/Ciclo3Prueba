package com.dfguerrero.backend.backend.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfguerrero.backend.backend.convertidores.ConvertidorEquipo;
import com.dfguerrero.backend.backend.dto.EquipoDTO;
import com.dfguerrero.backend.backend.repositorios.RepositorioEquipo;


@Service
public class ServicioEquipo {
    
    @Autowired
    private RepositorioEquipo repositorioEquipo;

    private ConvertidorEquipo convertidorEquipo = new ConvertidorEquipo();

    public List<EquipoDTO> listar(){
        return convertidorEquipo.aDTO(repositorioEquipo.findAll());
    }

    public EquipoDTO guardar(EquipoDTO equipo){
        return convertidorEquipo.aDTO(repositorioEquipo.save(convertidorEquipo.aEntidad(equipo)));
    }

}
