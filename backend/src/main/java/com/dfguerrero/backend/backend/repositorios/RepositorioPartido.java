package com.dfguerrero.backend.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dfguerrero.backend.backend.entidades.Partido;

@Repository
public interface RepositorioPartido extends JpaRepository<Partido, Integer>{
    
}
