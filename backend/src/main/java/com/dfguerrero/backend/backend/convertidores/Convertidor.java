package com.dfguerrero.backend.backend.convertidores;

import java.util.ArrayList;
import java.util.List;

public abstract class Convertidor<E, D> {
    
    public abstract E aEntidad(D objeto);

    public abstract D aDTO(E objeto);

    public List<E> aEntidad (List<D> lista){
        ArrayList<E> salida = new ArrayList<>();
        for (D objeto : lista){
            salida.add(aEntidad(objeto));
        }
        return salida;
    }

    public List<D> aDTO (List<E> lista){
        ArrayList<D> salida = new ArrayList<>();
        for (E objeto : lista){
            salida.add(aDTO(objeto));
        }
        return salida;
    }
}
