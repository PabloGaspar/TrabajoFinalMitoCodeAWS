package com.cursomito.lenguajepreferencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursomito.lenguajepreferencia.entity.Preferencia;

public interface PreferenciaRepository extends JpaRepository<Preferencia, Integer> {

}
