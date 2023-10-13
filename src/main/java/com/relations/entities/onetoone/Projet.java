package com.relations.entities.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Projet {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String description,titre,url;
	@OneToOne
	@MapsId
	@JoinColumn(name = "chef_id")
	private Chef chef;
	
	
	
}
