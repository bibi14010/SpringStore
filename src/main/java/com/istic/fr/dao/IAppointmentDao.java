package com.istic.fr.dao;

import com.istic.fr.entities.Appointment;
import com.istic.fr.entities.Client;
import com.istic.fr.entities.Location;
import com.istic.fr.entities.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;
@Repository
@Transactional
public interface IAppointmentDao extends JpaRepository<Appointment, Integer> {

	public List<Appointment> findAll();

	public  List<Appointment> findById(long id);

	public List<Appointment> findByDate(Date date) ;
	
	public List<Appointment> findByLocation(Location l);
	
	public List<Appointment> findByPrestataire(Prestataire p);
	
	public List<Appointment> findByClient(Client c);
	
	default void displayList(List<Appointment> resultList) {
		System.out.println("Appointments Avaliable : "+resultList.size());
		for (Appointment appointment : resultList) {
			System.out.println("- Id of Appointment is "+appointment.getId());
		}
	}
}
