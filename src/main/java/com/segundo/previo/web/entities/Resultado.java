package com.segundo.previo.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Resultado {
	@Id
	private int id;
	
	private Partido partido_id;
	
	private Seleccion seleccion_id;
	
	private int goles;
	
	private int amarillas;
	
	private int rojas;
}
