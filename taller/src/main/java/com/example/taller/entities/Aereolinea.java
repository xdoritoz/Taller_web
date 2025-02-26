package com.example.taller.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Aereolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAereolinea;

    private String nombre;

    @ManyToMany
    @JoinTable(name = "aereolineaVuelo",
            joinColumns = @JoinColumn(name = "aereolineaID"),
            inverseJoinColumns = @JoinColumn(name = "vueloID"))
    private Set<Vuelo> vuelos; // Renombrado a "vuelos" para mayor claridad
}
