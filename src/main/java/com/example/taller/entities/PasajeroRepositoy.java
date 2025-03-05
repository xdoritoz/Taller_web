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
    Pasajero findByPasjeroId(Long pasajeroId);
    Pasajero findByPasajeroName(String pasajeroName);
    Pasajero findBypasajeroIdIn(List<Long> pasajeroIds);
    Pasajero findByPasajeroNameLike(String pasajeroNameLike);
    Pasajero findByPasajeroNameContaining(String pasajeroNameContains);

    @Query("select p from Pasajero p where p.nombre = ?1")
    Pasajero findByNombre(String nombre);
    @Query("select  p from Pasajero  p where p.id = ?1")
    Pasajero findByIdPasajero(Long idAereolinea);
    @Query("select p from Pasajero p where p.id in ?1")
    Pasajero findByIdPasajeroEnLista(List<Long> idAereolineas);
    @Query("select p from Aereolinea p where p.nombre like ?1")
    Pasajero findByNombrePasajeroLike(String nombre);
    @Query("select p from Pasajero p where p.nombre not like ?1")
    Pasajero findByNombrePasajeroNotLike(String nombre);


}
