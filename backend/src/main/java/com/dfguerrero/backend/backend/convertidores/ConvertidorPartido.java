package com.dfguerrero.backend.backend.convertidores;

import com.dfguerrero.backend.backend.dto.PartidoDTO;
import com.dfguerrero.backend.backend.entidades.Partido;

public class ConvertidorPartido extends Convertidor<Partido, PartidoDTO>{

    @Override
    public Partido aEntidad(PartidoDTO objeto) {
        return Partido.builder()
            .id(objeto.getId())
            .usuario(objeto.getUsuario())
            .local(objeto.getLocal())
            .visitante(objeto.getVisitante())
            .fecha(objeto.getFecha())
            .goles_local(objeto.getGoles_local())
            .goles_visitante(objeto.getGoles_visitante())
            .build();
    }

    @Override
    public PartidoDTO aDTO(Partido objeto) {
        return PartidoDTO.builder()
            .id(objeto.getId())
            .usuario(objeto.getUsuario())
            .local(objeto.getLocal())
            .visitante(objeto.getVisitante())
            .fecha(objeto.getFecha())
            .goles_local(objeto.getGoles_local())
            .goles_visitante(objeto.getGoles_visitante())
            .build();
    }
    
}
