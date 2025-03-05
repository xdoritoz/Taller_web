package com.example.taller.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface reservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByReserva(String reserva);
    Reserva findByReservaId(Long reservaId);
    Reserva findByReservaName(String reservaName);
    Reserva findByreservaIdIn(List<Long> reservaIds);
    Reserva findByReservaNameLike(String reservaNameLike);
    Reserva findByReservaNameContaining(String reservaNameContains);

    @Query("select p from Reserva p where p.codigoReserva = ?1")
    Reserva findByNombre(String nombre);
    @Query("select  p from Reserva  p where p.id = ?1")
    Reserva findByIdReserva(Long idAereolinea);
    @Query("select p from Reserva p where p.id in ?1")
    Reserva findByIdReservaEnLista(List<Long> idAereolineas);
    @Query("select p from Reserva p where p.id  not in   ?1")
    Reserva findByIdPasaporteLike(Long idPasaporte);
    @Query("select p from Reserva p where p.id in ?1")
    Reserva findByNombreReservaNotLike(Long pasaporteid);



}
