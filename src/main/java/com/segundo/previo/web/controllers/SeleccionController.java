package com.segundo.previo.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segundo.previo.web.entities.Seleccion;
import com.segundo.previo.web.repository.SeleccionRepo;

@Controller
@RequestMapping("/selecciones")
public class SeleccionController {
	
	@Autowired
	private SeleccionRepo seleccionRepo;
	
	@GetMapping("/")
	public String listarSelecciones(Model model) {
		
		List<Seleccion> selecciones = seleccionRepo.findAll();
		model.addAttribute("seleccion", selecciones);
		
		return "index";
	}
	
	@PostMapping("/")
	public String registrarSeleccion(@RequestBody Seleccion seleccion) {
		
		return "registar seleccion";
	}
	
	@PutMapping("/")
	public String actualizarSeleccion() {
		return "actualizar seleccion";
	}
	
	@GetMapping("{id}")
	public String mostrarSeleccion() {
		return "motrar sleecion: ";
	}
	
	@DeleteMapping("/{id}")
	public String eliminarSeleccion() {
		return "eliminar seleccion: ";
	}
	
	
	
	
}
