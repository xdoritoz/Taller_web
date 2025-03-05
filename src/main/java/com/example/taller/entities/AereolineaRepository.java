package com.example.taller.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AereolineaRepository extends JpaRepository<Aereolinea, Long> {

    List<Aereolinea> findByAerolinea(String aerolinea);
    Aereolinea findByAerolineaId(Long aerolineaId);
    Aereolinea findByAerolineaName(String aerolineaName);
    Aereolinea findByAereolineaIdIn(List<Long> aerolineaIds);
    Aereolinea findAereolineasByAereolineaNameLike(String aerolineaName);
    Aereolinea findAereolineasByAreolineaNameContaining(String aerolineaName);

   @Query("select a from Aereolinea a where a.nombre = ?1")
    Aereolinea findByNombre(String nombre);
   @Query("select  a from Aereolinea  a where a.idAereolinea = ?1")
    Aereolinea findByIdAereolinea(Long idAereolinea);
   @Query("select a from Aereolinea a where a.idAereolinea in ?1")
    Aereolinea findByIdAereolineasEnLista(List<Long> idAereolineas);
   @Query("select a from Aereolinea a where a.nombre like ?1")
    Aereolinea findByNombreLike(String nombre);
   @Query("select a from Aereolinea a where a.nombre not like ?1")
    Aereolinea findByNombreNotLike(String nombre);







}
