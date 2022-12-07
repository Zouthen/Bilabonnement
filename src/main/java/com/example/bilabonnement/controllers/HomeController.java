package com.example.bilabonnement.controllers;

import com.example.bilabonnement.models.LeasingContract;
import com.example.bilabonnement.models.Rentee;
import com.example.bilabonnement.models.User;
import com.example.bilabonnement.repositories.CarRepository;
import com.example.bilabonnement.repositories.LogginginRepository;
import com.example.bilabonnement.services.CarService;
import com.example.bilabonnement.services.RentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class HomeController
{

    CarRepository repo = new CarRepository();
    RentService rent = new RentService();
    LeasingContract leasing = new LeasingContract();

    public HomeController() throws IOException
    {
    }

    public class htmlController
    {
        @GetMapping("/")
        public String index()
        {
            return "index";
        }
    }

    //TEMP login så vi kan arbejde med næste side
    @GetMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("AllCars", repo.getAllCars());
        model.addAttribute("SmallCars", repo.getAllCarsByType("small"));
        model.addAttribute("MediumCars", repo.getAllCarsByType("medium"));
        model.addAttribute("BigCars", repo.getAllCarsByType("big"));
        model.addAttribute("LuxuryCars", repo.getAllCarsByType("luxury"));

        return "loggedInAdmin";
    }



    @PostMapping("/createleasing")
    public String createLeasing(LeasingContract leasingContract, Rentee rentee)
    {

        rent.createRentalContract(leasingContract, rentee);

        return "redirect:/login";
    }
    @PostMapping("/service")
    public String service()
    {
        return "service";
    }

}

// Ting vi tror fungerer / skal testes
//TODO create car
//TODO delete car
//TODO update car (damaged)
//TODO update car (available)
//TODO get available car
//TODO get all cars
//TODO get damaged cars
//TODO get rented cars
//TODO get rentee (from name or email)
//TODO create rentee
//TODO delete rentee
//TODO update rentee
//TODO opret rental table i DB

// Ting vi mangler
//TODO login
//TODO alt html / css
//TODO test af alt
//TODO binde tingene sammen
//TODO pris ved skade
//TODO sammenlagt pris for udlejede biler
//TODO registrer nye lejeaftaler



// TO DO today
//TODO opdater trello!!!
//TODO delete contract
//TODO alter contract
//TODO fix pris


