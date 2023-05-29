package com.segundo.previo.web.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Partido {
	@Id
	private int id;
	
	private Timestamp fecha;
	
	
	private Estadio estadio_id;
}
