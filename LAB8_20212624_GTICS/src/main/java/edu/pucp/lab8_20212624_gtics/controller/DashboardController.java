package edu.pucp.lab8_20212624_gtics.controller;

import edu.pucp.lab8_20212624_gtics.entity.Expedition;
import edu.pucp.lab8_20212624_gtics.entity.Planet;
import edu.pucp.lab8_20212624_gtics.repository.ExpeditionRepository;
import edu.pucp.lab8_20212624_gtics.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {
    @Autowired
    ExpeditionRepository expeditionRepository;
    @Autowired
    PlanetRepository planetRepository;

    @GetMapping("/")
    public String dashboard(Model model) {
        List<Expedition> expeditions = expeditionRepository.findAll();
        List<Planet> planets = planetRepository.findAll();
        model.addAttribute("expeditions", expeditions);
        model.addAttribute("planets", planets);
        return "dashboard";
    }
}
