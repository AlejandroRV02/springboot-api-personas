package com.arv.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arv.api.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

	
	
}
