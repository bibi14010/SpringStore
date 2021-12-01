package com.istic.fr.dao;

import com.istic.fr.entities.Appointment;
import com.istic.fr.entities.Entreprise;
import com.istic.fr.entities.Location;
import com.istic.fr.entities.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface IEntrepriseDao extends JpaRepository<Entreprise, Integer>{


	
	public List<Entreprise> findAll();
	
	public List<Entreprise> findById(long id);
	
	public List<Entreprise> findByLocation(Location l);
	
	public List<Entreprise> findByName(String name);

	public List<Entreprise> findBySector(String sector);

	default void displayList(List<Entreprise> resultList) {
		System.out.println("Entreprises Avaliable : "+resultList.size());
		for (Entreprise entreprise : resultList) {
			System.out.println("- Id of Entreprise is "+entreprise.getId());
		}
	}
}
