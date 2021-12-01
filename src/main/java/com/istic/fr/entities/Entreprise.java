package com.istic.fr.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Entreprises")
@Data
@NoArgsConstructor
public class Entreprise {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;
	
	private String sector;

	@OneToOne
	private Location location;

	@Override
	public String toString(){
		return name+" - "+location.toString()+" - "+sector;
	}

}
