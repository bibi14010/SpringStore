package com.istic.fr.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Table(name="Locations")
@NamedQueries({
	@NamedQuery(name="toutesLesLocations",query="select l from Location l"),
	@NamedQuery(name="toutesLesLocationsParVille",query="select l from Location l where l.city=:cityWanted")
})
@Data
@NoArgsConstructor
public class Location {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String street;

	@Column(nullable = true)
	private int streetNumber;

	@Column(nullable = false)
	private int postCode;

	@Column(nullable = false)
	private String city;

	@Override
	public String toString() {
		 return this.getCity()+","+this.getStreetNumber()+" "+this.getStreet()+","+this.getPostCode();
	}
}
