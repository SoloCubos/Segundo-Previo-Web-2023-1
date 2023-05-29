package com.segundo.previo.web.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Partido {
	private int id;
	private Date fecha;
	private Estadio estadio_id;
}
