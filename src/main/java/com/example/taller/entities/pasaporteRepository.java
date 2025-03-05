package com.example.taller.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface pasaporteRepository extends JpaRepository<Pasaporte, Long> {

    List<Pasaporte> findByReserva(String reserva);
    Pasaporte findByReservaId(Long reservaId);
    Pasaporte findByReservaName(String reservaName);
    Pasaporte findByreservaIdIn(List<Long> reservaIds);
    Pasaporte findByReservaNameLike(String reservaNameLike);
    Pasaporte findByReservaNameContaining(String reservaNameContains);

    @Query("select p from Pasaporte p where p.numero = ?1")
    Reserva findByNombre(String nombre);
    @Query("select  p from Pasaporte p where p.id = ?1")
    Reserva findByIdReserva(Long idAereolinea);
    @Query("select p from Pasaporte p where p.id in ?1")
    Reserva findByIdReservaEnLista(List<Long> idAereolineas);
    @Query("select p from Pasaporte p where p.id  not in   ?1")
    Reserva findByIdPasaporteLike(Long idPasaporte);
    @Query("select p from Reserva p where p.id in ?1")
    Reserva findByNombreReservaNotLike(Long pasaporteid);


}
