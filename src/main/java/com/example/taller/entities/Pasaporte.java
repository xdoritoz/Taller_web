package com.example.taller.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pasaporte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numero;

    @OneToOne(mappedBy = "pasaporte")
    private Pasajero pasajero;
}
