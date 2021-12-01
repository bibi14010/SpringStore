package com.istic.fr.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Prestataire")
@Data
public class Prestataire extends Personne {

	@ManyToOne(targetEntity=Entreprise.class, fetch=FetchType.EAGER)
	private Entreprise entreprise;

	public Prestataire() {
		super();
	}

	@Override
	public String toString(){
		return getFirstName()+" "+getLastName()+" ("+getEmail()+")";
	}

}
