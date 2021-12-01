package com.istic.fr.controller;

import com.istic.fr.dao.ILocationDao;
import com.istic.fr.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
public class LocationController {

    @Autowired
    ILocationDao locationDao;

    @Value("${my-app.routes.accueil}")
    private String home_url;
    @Value("${my-app.routes.locationsList}")
    private String locations_url;
    @Value("${my-app.routes.clientsList}")
    private String clients_url;
    @Value("${my-app.routes.entreprisesList}")
    private String entreprises_url;
    @Value("${my-app.routes.appointmentsList}")
    private String appointments_url;
    @Value("${my-app.routes.prestatairesList}")
    private String prestataires_url;

    @Value("${my-app.routes.locationsAjout}")
    private String add_locations_url;
    @Value("${my-app.routes.clientsAjout}")
    private String add_clients_url;
    @Value("${my-app.routes.entreprisesAjout}")
    private String add_entreprises_url;
    @Value("${my-app.routes.appointmentsAjout}")
    private String add_appointments_url;
    @Value("${my-app.routes.prestatairesAjout}")
    private String add_prestataires_url;
    @GetMapping("/locations")
    @ResponseBody
    public ModelAndView locations(){
        List<Location> locationList = locationDao.findAll();

        ModelAndView view = new ModelAndView(locations_url);
        view.addObject("home_url",home_url);
        view.addObject("location_url",locations_url);
        view.addObject("client_url",clients_url);
        view.addObject("entreprise_url",entreprises_url);
        view.addObject("appointment_url",appointments_url);
        view.addObject("prestataire_url",prestataires_url);
        view.addObject("add_location_url",add_locations_url);
        view.addObject("add_client_url",add_clients_url);
        view.addObject("add_entreprise_url",add_entreprises_url);
        view.addObject("add_appointment_url",add_appointments_url);
        view.addObject("add_prestataire_url",add_prestataires_url);

        view.addObject("locations_object",locationList);
        return  view;
    }

    @GetMapping("/addLocation")
    @ResponseBody
    public ModelAndView addLocation(){
        ModelAndView view = new ModelAndView(add_locations_url);
        view.addObject("home_url",home_url);
        view.addObject("location_url",locations_url);
        view.addObject("client_url",clients_url);
        view.addObject("entreprise_url",entreprises_url);
        view.addObject("appointment_url",appointments_url);
        view.addObject("prestataire_url",prestataires_url);
        view.addObject("add_location_url",add_locations_url);
        view.addObject("add_client_url",add_clients_url);
        view.addObject("add_entreprise_url",add_entreprises_url);
        view.addObject("add_appointment_url",add_appointments_url);
        view.addObject("add_prestataire_url",add_prestataires_url);

        Location location = new Location();
        view.addObject("location",location);

        return  view;
    }

    @PostMapping("/addLocation")
    @ResponseBody
    public ModelAndView addLocationPost(@ModelAttribute("location") Location location){

        log.debug(location.toString());
        locationDao.saveAndFlush(location);

        ModelAndView view = new ModelAndView("redirect:"+locations_url);
        view.addObject("home_url",home_url);
        view.addObject("location_url",locations_url);
        view.addObject("client_url",clients_url);
        view.addObject("entreprise_url",entreprises_url);
        view.addObject("appointment_url",appointments_url);
        view.addObject("prestataire_url",prestataires_url);
        view.addObject("add_location_url",add_locations_url);
        view.addObject("add_client_url",add_clients_url);
        view.addObject("add_entreprise_url",add_entreprises_url);
        view.addObject("add_appointment_url",add_appointments_url);
        view.addObject("add_prestataire_url",add_prestataires_url);
        return  view;
    }
}
