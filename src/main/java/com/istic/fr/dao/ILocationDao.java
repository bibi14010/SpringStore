package com.istic.fr.dao;

import com.istic.fr.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface ILocationDao extends JpaRepository<Location, Long>, CrudRepository<Location,Long> {

	public List<Location> findById(long id);
	
	default void displayList(List<Location> resultList) {
		System.out.println("Locations Avaliable : "+resultList.size());
		for (Location location : resultList) {
			System.out.println("- Id of Location is "+location.getId());
		}
	}
}
