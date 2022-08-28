package com.dfguerrero.backend.backend.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dfguerrero.backend.backend.dto.UsuarioDTO;
import com.dfguerrero.backend.backend.servicios.ServicioUsuario;

@RestController
@RequestMapping(path = "/api/usuarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ControladorUsuario {
    
    @Autowired
    private ServicioUsuario servicioUsuario;

    @PostMapping("identificar")
    public UsuarioDTO identificar(@RequestParam String nombreUsuario, @RequestParam String contraseña){
        return servicioUsuario.identificar(nombreUsuario, contraseña); 
    }

    @PostMapping("registrar")
    public UsuarioDTO registrar(@RequestBody UsuarioDTO usuario){
        return servicioUsuario.registrar(usuario); 
    }

}
