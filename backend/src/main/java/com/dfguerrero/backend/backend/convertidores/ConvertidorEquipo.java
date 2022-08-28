package com.dfguerrero.backend.backend.convertidores;

import com.dfguerrero.backend.backend.dto.EquipoDTO;
import com.dfguerrero.backend.backend.entidades.Equipo;

public class ConvertidorEquipo extends Convertidor<Equipo, EquipoDTO>{

    @Override
    public Equipo aEntidad(EquipoDTO objeto) {
        return Equipo.builder()
            .id(objeto.getId())
            .nombre(objeto.getNombre())
            .build();
    }

    @Override
    public EquipoDTO aDTO(Equipo objeto) {
        return EquipoDTO.builder()
            .id(objeto.getId())
            .nombre(objeto.getNombre())
            .build();
    }
    
}
