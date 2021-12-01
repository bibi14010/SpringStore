package com.istic.fr.dao;

import com.istic.fr.entities.Appointment;
import com.istic.fr.entities.Entreprise;
import com.istic.fr.entities.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface IPrestataireDao extends JpaRepository<Prestataire, Long> {

	public List<Prestataire> findAll();

	public List<Prestataire> findById(long id);
	
	public List<Prestataire> findByEntreprise(Entreprise e);
	
	default void displayList(List<Prestataire> resultList) {
		System.out.println("Prestataires Avaliable : "+resultList.size());
		for (Prestataire entreprise : resultList) {
			System.out.println("- Id of Prestataire is "+entreprise.getId());
		}
	}
}
