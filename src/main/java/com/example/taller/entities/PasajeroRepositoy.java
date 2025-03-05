package com.example.taller.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PasajeroRepositoy extends JpaRepository<Pasajero, Long> {
    List<Pasajero> findByPasajero(String pasajero);
    Pasajero findByPasajeroId(Long pasajeroId);
    Pasajero findByPasajeroName(String pasajeroName);
    Pasajero findBypasajeroIdIn(List<Long> pasajeroIds);
    Pasajero findByPasajeroNameLike(String pasajeroNameLike);
    Pasajero findByPasajeroNameContaining(String pasajeroNameContains);

    @Query("SELECT p FROM Pasajero p WHERE p.nombre = ?1")
    Pasajero findByNombre(String nombre);
    @Query("SELECT p FROM Pasajero  p WHERE p.id = ?1")
    Pasajero findByIdPasajero(Long idAereolinea);
    @Query("SELECT p FROM Pasajero p WHERE p.id in ?1")
    Pasajero findByIdPasajeroEnLista(List<Long> idAereolineas);
    @Query("SELECT p FROM Aereolinea p WHERE p.nombre LIKE ?1")
    Pasajero findByNombrePasajeroLike(String nombre);
    @Query("SELECT p FROM Pasajero p WHERE p.nombre NOT LIKE ?1")
    Pasajero findByNombrePasajeroNotLike(String nombre);
}
