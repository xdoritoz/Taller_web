package com.example.taller.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AereolineaRepository extends JpaRepository<Aereolinea, Long> {

    List<Aereolinea> findByAereolinea(String aerolinea);
    Aereolinea findByAereolineaId(Long aerolineaId);
    Aereolinea findByAereolineaName(String aerolineaName);
    Aereolinea findByAereolineaIdIn(List<Long> aerolineaIds);
    Aereolinea findAereolineasByAereolineaNameLike(String aerolineaName);
    Aereolinea findAereolineasByAereolineaNameContaining(String aerolineaName);

   @Query("SELECT a FROM Aereolinea a WHERE a.nombre = ?1")
    Aereolinea findByNombre(String nombre);
   @Query("SELECT a FROM Aereolinea  a WHERE a.idAereolinea = ?1")
    Aereolinea findByIdAereolinea(Long idAereolinea);
   @Query("SELECT a FROM Aereolinea a WHERE a.idAereolinea IN ?1")
    Aereolinea findByIdAereolineasEnLista(List<Long> idAereolineas);
   @Query("SELECT a FROM Aereolinea a WHERE a.nombre LIKE ?1")
    Aereolinea findByNombreLike(String nombre);
   @Query("SELECT a FROM Aereolinea a WHERE a.nombre NOT LIKE ?1")
    Aereolinea findByNombreNotLike(String nombre);
}
