package com.istic.fr.controller;

import com.istic.fr.dao.IClientDao;
import com.istic.fr.entities.Client;
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

@Controller
@Slf4j
public class ClientController {

    @Autowired
    IClientDao clientDao;

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
    @GetMapping("/clients")
    @ResponseBody
    public ModelAndView clients(){
        List<Client> clientList = clientDao.findAll();

        ModelAndView view = new ModelAndView(clients_url);
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

        view.addObject("clients_object",clientList);
        return  view;
    }

    @GetMapping("/addClient")
    @ResponseBody
    public ModelAndView addClient(){
        ModelAndView view = new ModelAndView(add_clients_url);
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

        Client client = new Client();
        view.addObject("client",client);
        return  view;
    }

    @PostMapping("/addClient")
    @ResponseBody
    public ModelAndView addClient(@ModelAttribute("client") Client client){

        log.debug(client.toString());
        clientDao.saveAndFlush(client);

        ModelAndView view = new ModelAndView("redirect:"+clients_url);
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
