package com.segundo.previo.web.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seleccion {
	private int id;
	private String nombre;
	private Continente continente_id;
	private int grupo;
}
