package com.istic.fr.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Table(name="Personnes")
@Data
@NoArgsConstructor
@Slf4j
public class Personne {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;


	@Column(unique=true,nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

}
