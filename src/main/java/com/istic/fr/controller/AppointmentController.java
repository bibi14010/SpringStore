package com.istic.fr.controller;

import com.istic.fr.dao.IAppointmentDao;
import com.istic.fr.dao.IClientDao;
import com.istic.fr.dao.ILocationDao;
import com.istic.fr.dao.IPrestataireDao;
import com.istic.fr.entities.Appointment;
import com.istic.fr.entities.Client;
import com.istic.fr.entities.Location;
import com.istic.fr.entities.Prestataire;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class AppointmentController {

    @Autowired
    IAppointmentDao appointmentDao;
    @Autowired
    IClientDao clientDao;
    @Autowired
    IPrestataireDao prestataireDao;
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

    @GetMapping("/appointments")
    @ResponseBody
    public ModelAndView appointments(){

        List<Appointment> appointmentList = appointmentDao.findAll();

        ModelAndView view = new ModelAndView(appointments_url);
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

        view.addObject("appointments_object",appointmentList);
        return  view;
    }

    @GetMapping("/addAppointment")
    @ResponseBody
    public  ModelAndView addAppointment(){
        ModelAndView view = new ModelAndView(add_appointments_url);
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

        List<Client> clientList = clientDao.findAll();
        List<Prestataire> prestataireList = prestataireDao.findAll();
        List<Location> locationList = locationDao.findAll();
        Appointment appointment = new Appointment();

        view.addObject("appointment",appointment);
        view.addObject("clients_object",clientList);
        view.addObject("prestataires_object",prestataireList);
        view.addObject("locations_object",locationList);
        return  view;
    }

    @PostMapping("/addAppointment")
    @ResponseBody
    public  ModelAndView addAppointment(@ModelAttribute("appointment")Appointment appointment){
        log.debug(appointment.toString());
        appointment.setStatut(0);
        appointmentDao.saveAndFlush(appointment);

        ModelAndView view = new ModelAndView("redirect:"+appointments_url);
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
