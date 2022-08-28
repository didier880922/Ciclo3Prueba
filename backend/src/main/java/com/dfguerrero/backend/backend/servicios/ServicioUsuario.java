package com.dfguerrero.backend.backend.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfguerrero.backend.backend.convertidores.ConvertidorUsuario;
import com.dfguerrero.backend.backend.dto.UsuarioDTO;
import com.dfguerrero.backend.backend.entidades.Usuario;
import com.dfguerrero.backend.backend.excepciones.LoginException;
import com.dfguerrero.backend.backend.excepciones.UsuarioExisteException;
import com.dfguerrero.backend.backend.repositorios.RepositorioUsuario;

@Service
public class ServicioUsuario {
    
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    private ConvertidorUsuario convertidorUsuario = new ConvertidorUsuario();

    public UsuarioDTO login(String nombre, String contraseña){
        Optional<Usuario> usuario = repositorioUsuario.findByNombreUsuario(nombre);
        if (usuario.isEmpty() || !usuario.get().comprobarContraseña(contraseña)){
            throw new LoginException("La información de usuario y contraseña es incorrecta");
        }
        return convertidorUsuario.aDTO(usuario.get());
    }

    public UsuarioDTO registrar (UsuarioDTO usuario){
        usuario.setId(0);
        if (repositorioUsuario.findByCorreo(usuario.getCorreo()).isPresent()){
            throw new UsuarioExisteException("El correo electronico ya se encuentra registrado");
        }
        if (repositorioUsuario.findByNombreUsuario(usuario.getNombreUsuario()).isPresent()){
            throw new UsuarioExisteException("El nombre de usuario ya se encuentra en uso");
        }
        return convertidorUsuario.aDTO(repositorioUsuario.save(convertidorUsuario.aEntidad(usuario)));
    }
}
