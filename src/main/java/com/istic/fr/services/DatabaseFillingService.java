package com.istic.fr.services;

import com.istic.fr.dao.*;
import com.istic.fr.entities.Client;
import com.istic.fr.entities.Entreprise;
import com.istic.fr.entities.Location;
import com.istic.fr.entities.Prestataire;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@NoArgsConstructor
public class DatabaseFillingService {

    @Autowired
    ILocationDao locationDao;
    @Autowired
    IEntrepriseDao entrepriseDao;
    @Autowired
    IPrestataireDao prestataireDao;
    @Autowired
    IClientDao clientDao;

    public void fillDatabase(){

        List<Location> locationList = new ArrayList<Location>();
        List<Entreprise> entrepriseList = new ArrayList<Entreprise>();
        List<Prestataire> prestataireList = new ArrayList<Prestataire>();
        List<Client> clientList = new ArrayList<Client>();
        //SFR
        Location location_1 = new Location();
        location_1.setCity("Rennes");
        location_1.setPostCode(35000);
        location_1.setStreetNumber(1);
        location_1.setStreet("Rue Jouannet");
        locationList.add(location_1);

        //Capgemini
        Location location_2 = new Location();
        location_2.setCity("Paris");
        location_2.setPostCode(75017);
        location_2.setStreetNumber(11);
        location_2.setStreet("Rue de Tilsitt");
        locationList.add(location_2);

        // Sopra Steria
        Location location_3 = new Location();
        location_3.setCity("Sèvres");
        location_3.setPostCode(92310);
        location_3.setStreetNumber(1);
        location_3.setStreet("Avenue de la Cristallerie");
        locationList.add(location_3);

        // Alkante
        Location location_4 = new Location();
        location_4.setCity("Saint-Malo");
        location_4.setPostCode(35400);
        location_4.setStreetNumber(7);
        location_4.setStreet("Allée Métis");
        locationList.add(location_4);

        //Societe Generale
        Location location_5 = new Location();
        location_5.setCity("La Rochelle");
        location_5.setPostCode(17000);
        location_5.setStreetNumber(12);
        location_5.setStreet("Rue du Palais");
        locationList.add(location_5);

        //Boulangerie Pâtisserie du Schluthfeld
        Location location_6 = new Location();
        location_6.setCity("Strasbourg");
        location_6.setPostCode(67100);
        location_6.setStreetNumber(81);
        location_6.setStreet("Avenue de Colmar");
        locationList.add(location_6);

        Entreprise entreprise_1 = new Entreprise();
        entreprise_1.setLocation(location_1);
        entreprise_1.setName("SFR");
        entreprise_1.setSector("Radio-Télécommunication");
        entrepriseList.add(entreprise_1);

        Entreprise entreprise_2 = new Entreprise();
        entreprise_2.setLocation(location_2);
        entreprise_2.setName("Capgemini");
        entreprise_2.setSector("Informatique");
        entrepriseList.add(entreprise_2);

        Entreprise entreprise_3 = new Entreprise();
        entreprise_3.setLocation(location_3);
        entreprise_3.setName("Sopra Steria");
        entreprise_3.setSector("Informatique");
        entrepriseList.add(entreprise_3);

        Entreprise entreprise_4 = new Entreprise();
        entreprise_4.setLocation(location_4);
        entreprise_4.setName("Alkante");
        entreprise_4.setSector("Informatique");
        entrepriseList.add(entreprise_4);

        Entreprise entreprise_5 = new Entreprise();
        entreprise_5.setLocation(location_5);
        entreprise_5.setName("Societe Generale");
        entreprise_5.setSector("Finances");
        entrepriseList.add(entreprise_5);

        Entreprise entreprise_6 = new Entreprise();
        entreprise_6.setLocation(location_6);
        entreprise_6.setName("Boulangerie Pâtisserie du Schluthfeld");
        entreprise_6.setSector("Alimentation");
        entrepriseList.add(entreprise_6);

        Prestataire prestataire_1 = new Prestataire();
        prestataire_1.setFirstName("Marc");
        prestataire_1.setLastName("Dubois");
        prestataire_1.setEmail("marc.dubois@istic.taa");
        prestataire_1.setPassword("mdubois");
        prestataire_1.setEntreprise(entreprise_1);
        prestataireList.add(prestataire_1);

        Prestataire prestataire_2 = new Prestataire();
        prestataire_2.setFirstName("Jean");
        prestataire_2.setLastName("Dubuisson");
        prestataire_2.setEmail("jean.dubuisson@istic.taa");
        prestataire_2.setPassword("jdubuisson");
        prestataire_2.setEntreprise(entreprise_2);
        prestataireList.add(prestataire_2);

        Prestataire prestataire_3 = new Prestataire();
        prestataire_3.setFirstName("Antoinne");
        prestataire_3.setLastName("Delaroche");
        prestataire_3.setEmail("antoine.delaroche@istic.taa");
        prestataire_3.setPassword("adelaroche");
        prestataire_3.setEntreprise(entreprise_3);
        prestataireList.add(prestataire_3);

        Prestataire prestataire_4 = new Prestataire();
        prestataire_4.setFirstName("Léo");
        prestataire_4.setLastName("Tilier");
        prestataire_4.setEmail("leo.tilier@istic.taa");
        prestataire_4.setPassword("ltilier");
        prestataire_4.setEntreprise(entreprise_4);
        prestataireList.add(prestataire_4);

        Prestataire prestataire_5 = new Prestataire();
        prestataire_5.setFirstName("Kyle");
        prestataire_5.setLastName("Colby");
        prestataire_5.setEmail("kyle.colby@istic.taa");
        prestataire_5.setPassword("kcolby");
        prestataire_5.setEntreprise(entreprise_5);
        prestataireList.add(prestataire_5);

        Prestataire prestataire_6 = new Prestataire();
        prestataire_6.setFirstName("Arnaud");
        prestataire_6.setLastName("Chauver");
        prestataire_6.setEmail("arnaud.chauvet@istic.taa");
        prestataire_6.setPassword("achauvet");
        prestataire_6.setEntreprise(entreprise_6);
        prestataireList.add(prestataire_6);

        Client client_1 = new Client();
        client_1.setFirstName("Philip");
        client_1.setLastName("Côté");
        client_1.setEmail("philip.cote@istic.taa");
        client_1.setPassword("pcote");
        clientList.add(client_1);

        Client client_2 = new Client();
        client_2.setFirstName("Odette");
        client_2.setLastName("Michaud");
        client_2.setEmail("odette.michaud@istic.taa");
        client_2.setPassword("omichaud");
        clientList.add(client_2);

        Client client_3 = new Client();
        client_3.setFirstName("Arienne");
        client_3.setLastName("Dufresne");
        client_3.setEmail("arienne.dufresne@istic.taa");
        client_3.setPassword("adufresne");
        clientList.add(client_3);

        locationDao.saveAllAndFlush(locationList);
        entrepriseDao.saveAllAndFlush(entrepriseList);
        prestataireDao.saveAllAndFlush(prestataireList);
        clientDao.saveAllAndFlush(clientList);

        log.info("Database has been filled with defined test data.");
    }

}
