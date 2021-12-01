package com.istic.fr.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Clients")
@Data
public class Client extends Personne{

	private int numberOfAppointment;

	public Client() {
		super();
	}

	@Override
	public String toString(){
		return getFirstName()+" "+getLastName()+" ("+getEmail()+")";
	}

}
