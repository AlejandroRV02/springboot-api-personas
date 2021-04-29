package com.arv.api.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arv.api.dao.PersonaDAO;
import com.arv.api.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {

	@Autowired
	private PersonaDAO personaDAO;
	
	//Metodos HTTP
	
	@GetMapping("/listar")
	public List<Persona> listarPersonas() {
		return personaDAO.findAll();
	}
	
	@PostMapping("/guardar")
	public void guardarPersona(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
	
	@PutMapping("/modificar")
	public void actualizarPersona(@RequestBody Persona persona){
		personaDAO.save(persona);
	}
	
	@DeleteMapping("/eliminar/{idPersona}")
	public void eliminarPersona(Persona persona) {
		personaDAO.delete(persona);
	}
	
	@GetMapping("/persona/{idPersona}")
	public Persona encontrarPersona(Persona persona) {
		return personaDAO.findById(persona.getIdPersona()).orElse(null);
		
	}


}
