package com.example.taller.repositories;

import com.example.taller.entities.Pasaporte;
import com.example.taller.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface pasaporteRepository extends JpaRepository<Pasaporte, Long> {
    List<Pasaporte> findByReserva(String reserva);
    Pasaporte findByReservaId(Long reservaId);
    Pasaporte findByReservaName(String reservaName);
    Pasaporte findByReservaIdIn(List<Long> reservaIds);
    Pasaporte findByReservaNameLike(String reservaNameLike);
    Pasaporte findByReservaNameContaining(String reservaNameContains);

    @Query("SELECT p FROM Pasaporte p WHERE p.numero = ?1")
    Reserva findByNombre(String nombre);
    @Query("SELECT p FROM Pasaporte p WHERE p.id = ?1")
    Reserva findByIdReserva(Long idAereolinea);
    @Query("SELECT p FROM Pasaporte p WHERE p.id in ?1")
    Reserva findByIdReservaEnLista(List<Long> idAereolineas);
    @Query("SELECT p FROM Pasaporte p WHERE p.id  not in   ?1")
    Reserva findByIdPasaporteLike(Long idPasaporte);
    @Query("SELECT p FROM Reserva p WHERE p.id in ?1")
    Reserva findByNombreReservaNotLike(Long pasaporteid);
}
