package com.limayrac.banque.controller;

import com.limayrac.banque.dto.VirementDto;
import com.limayrac.banque.model.Compte;
import com.limayrac.banque.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/virement")
public class VirementViewController {

    private final ICompteService compteService;

    @Autowired
    public VirementViewController(ICompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping
    public String showVirementForm(Model model) {
        Iterable<Compte> comptesIterable = compteService.findAll();
        List<Compte> comptes = new ArrayList<>();
        comptesIterable.forEach(comptes::add);
        model.addAttribute("comptes", comptes);
        model.addAttribute("virementDto", new VirementDto());
        return "virement"; // Ceci correspond au nom du fichier virement.html dans /src/main/resources/templates
    }
}
