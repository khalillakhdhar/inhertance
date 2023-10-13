package com.relations.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Polygone extends Forme {

	private int angles;
}
