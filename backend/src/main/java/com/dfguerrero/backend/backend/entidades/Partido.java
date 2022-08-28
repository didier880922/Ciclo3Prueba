package com.dfguerrero.backend.backend.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Equipo local;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Equipo visitante;

    @Column(nullable = false)
    private Date fecha;
    
    @Column(nullable = false)
    private int goles_local;

    @Column(nullable = false)
    private int goles_visitante;
    
}
