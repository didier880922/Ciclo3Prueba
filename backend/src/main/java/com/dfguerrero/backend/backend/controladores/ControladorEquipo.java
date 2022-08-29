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

import com.dfguerrero.backend.backend.dto.EquipoDTO;
import com.dfguerrero.backend.backend.servicios.ServicioEquipo;

@RestController
@RequestMapping(path = "/api/equipos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ControladorEquipo {
    
    @Autowired
    private ServicioEquipo servicioEquipo;

    @GetMapping
    public List<EquipoDTO> listar(){
        return servicioEquipo.listar();
    }

    @PostMapping
    public EquipoDTO guardar(@RequestBody EquipoDTO equipo){
        return servicioEquipo.guardar(equipo);
    }

    /* 
    @GetMapping
    public Optional<Equipo> traerNombreEquipo(@PathVariable("id") Integer id){
        return servicioEquipo.findEquipo(id);
        */

    }
