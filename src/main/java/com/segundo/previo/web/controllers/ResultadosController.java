package com.segundo.previo.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segundo.previo.web.entities.Resultado;
import com.segundo.previo.web.repository.ResultadoRepo;

@RequestMapping("/selecciones/{id}/resultados")
@Controller
public class ResultadosController {
	
	@Autowired
	private ResultadoRepo resultadoRepo;
	
	@GetMapping
	public String mostrarResultados(Model model) {
		
		List<Resultado> resultados = resultadoRepo.findAll();
		model.addAttribute("resultado", resultados);
		
		return "resultados";
	}
	
}
