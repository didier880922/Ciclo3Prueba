package com.dfguerrero.backend.backend.dto;

import java.util.Date;

import com.dfguerrero.backend.backend.entidades.Equipo;
import com.dfguerrero.backend.backend.entidades.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartidoDTO {

    private int id;
    private Usuario usuario;
    private Equipo local;
    private Equipo visitante;
    private Date fecha;
    private int goles_local;
    private int goles_visitante;
    
}
