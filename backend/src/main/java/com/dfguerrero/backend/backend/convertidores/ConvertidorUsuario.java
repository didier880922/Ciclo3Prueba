package com.dfguerrero.backend.backend.convertidores;

import com.dfguerrero.backend.backend.dto.UsuarioDTO;
import com.dfguerrero.backend.backend.entidades.Usuario;

public class ConvertidorUsuario extends Convertidor <Usuario, UsuarioDTO>{

    @Override
    public Usuario aEntidad(UsuarioDTO objeto) {
        return Usuario.builder()
            .id(objeto.getId())
            .nombre(objeto.getNombre())
            .correo(objeto.getCorreo())
            .nombreUsuario(objeto.getNombreUsuario())
            .password(objeto.getPassword())
            .build();
    }

    @Override
    public UsuarioDTO aDTO(Usuario objeto) {
        return UsuarioDTO.builder()
            .id(objeto.getId())
            .nombre(objeto.getNombre())
            .correo(objeto.getCorreo())
            .nombreUsuario(objeto.getNombreUsuario())
            .password(null)
            .build();
    }

    
}
