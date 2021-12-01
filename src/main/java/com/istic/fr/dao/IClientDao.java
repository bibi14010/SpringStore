package com.istic.fr.dao;

import java.util.List;

import com.istic.fr.entities.Appointment;
import com.istic.fr.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IClientDao extends JpaRepository<Client, Long> {

	public List<Client> findAll();

	public List<Client> findById(int id);
	
	public List<Client> findByEmail(String email);
	
	public List<Client> findByFirstName(String firstName);
	
	public List<Client> findByLastName(String lastName);
	
	default void displayList(List<Client> resultList) {
		System.out.println("Clients Avaliable : "+resultList.size());
		for (Client appointment : resultList) {
			System.out.println("- Id of Client is "+appointment.getId());
		}
	}
}
