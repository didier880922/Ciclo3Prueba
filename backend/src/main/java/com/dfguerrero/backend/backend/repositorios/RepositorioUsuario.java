package com.dfguerrero.backend.backend.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dfguerrero.backend.backend.entidades.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {
    
    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    public Optional<Usuario> findByCorreo(String correo);
    
}
