package com.example.taller.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface reservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByReserva(String reserva);
    Reserva findByReservaId(Long reservaId);
    Reserva findByReservaName(String reservaName);
    Reserva findByReservaIdIn(List<Long> reservaIds);
    Reserva findByReservaNameLike(String reservaNameLike);
    Reserva findByReservaNameContaining(String reservaNameContains);

    @Query("SELECT p FROM Reserva p WHERE p.codigoReserva = ?1")
    Reserva findByNombre(String nombre);
    @Query("SELECT p FROM Reserva  p WHERE p.id = ?1")
    Reserva findByIdReserva(Long idAereolinea);
    @Query("SELECT p FROM Reserva p WHERE p.id IN ?1")
    Reserva findByIdReservaEnLista(List<Long> idAereolineas);
    @Query("SELECT p FROM Reserva p WHERE p.id  NOT IN   ?1")
    Reserva findByIdPasaporteLike(Long idPasaporte);
    @Query("SELECT p FROM Reserva p WHERE p.id in ?1")
    Reserva findByNombreReservaNotLike(Long pasaporteId);
}
