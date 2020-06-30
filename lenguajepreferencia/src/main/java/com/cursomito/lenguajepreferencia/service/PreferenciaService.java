package com.cursomito.lenguajepreferencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomito.lenguajepreferencia.entity.Preferencia;
import com.cursomito.lenguajepreferencia.repository.PreferenciaRepository;

@Service
public class PreferenciaService {
	
	@Autowired
	private PreferenciaRepository repository;
	
	public Preferencia guardarPreferencia(Preferencia preferencia) {
		return repository.save(preferencia);
	}
	
	public List<Preferencia> preferencias(){
		return repository.findAll();
	}
}
