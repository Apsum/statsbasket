package fr.goni.statsbasket.statsbasket.controller;

import model.Statistics;
import model.Teams;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {

    @GetMapping("/teams/{id}")
    public Teams getTeam(@PathVariable("id") String idTeam){
        Teams t1 = new Teams();
        return  t1;
    }

    //public Statistics getStatistics(){ }
}
