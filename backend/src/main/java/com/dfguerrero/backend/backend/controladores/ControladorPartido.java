package com.dfguerrero.backend.backend.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dfguerrero.backend.backend.dto.PartidoDTO;
import com.dfguerrero.backend.backend.servicios.ServicioPartido;

@RestController
@RequestMapping(path = "/api/partidos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ControladorPartido {

    @Autowired
    private ServicioPartido servicioPartido;

    @GetMapping
    public List<PartidoDTO> listar(){
        return servicioPartido.listar();
    }

    @PostMapping
    public PartidoDTO guardar(@RequestBody PartidoDTO partido){
        return servicioPartido.guardar(partido);
    }

    

}
