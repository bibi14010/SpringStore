package com.istic.fr.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="Appointments")
@Data
@NoArgsConstructor
public class Appointment {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String date;

	@OneToOne
	private Client client;

	@OneToOne
	private Prestataire prestataire;

	@OneToOne
	private Location location;
	
	// Dur�e en minute du rendez-vous
	private int time;
	
	// �tats : pr�vu -> valid� -> pass�
	private int statut=0;
	
	private String description;

	@Override
	public String toString(){
		String message = "Le "+date.toString()+", "+prestataire.toString()+" et "+client.toString()+" ont rendez-vous";
		if (time>=0){
			message+=" pour une durée de "+time+" minutes";
		}
		return message+".";
	}
}
