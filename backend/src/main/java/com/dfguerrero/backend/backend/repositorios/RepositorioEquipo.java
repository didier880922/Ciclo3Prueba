package com.dfguerrero.backend.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dfguerrero.backend.backend.entidades.Equipo;

@Repository
public interface RepositorioEquipo extends JpaRepository<Equipo, Integer> {
    
}
