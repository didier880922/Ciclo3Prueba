package com.dfguerrero.backend.backend.dto;

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
public class UsuarioDTO {
    
    private int id;
    private String nombre;
    private String correo;
    private String nombreUsuario;
    private String password;

}
