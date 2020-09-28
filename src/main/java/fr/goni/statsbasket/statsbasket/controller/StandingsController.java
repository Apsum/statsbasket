package fr.goni.statsbasket.statsbasket.controller;

import model.Standings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StandingsController {

    @GetMapping("/standing/league/{id]")
    public Standings getStanding(@PathVariable("id") String idLeague){

        Standings s1 = new Standings();
        return  s1 ;
    }
}
