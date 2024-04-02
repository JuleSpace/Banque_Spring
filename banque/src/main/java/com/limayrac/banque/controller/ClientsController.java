package com.limayrac.banque.controller;

import com.limayrac.banque.model.Client;
import com.limayrac.banque.model.Client;
import com.limayrac.banque.service.IClientService;
import com.limayrac.banque.service.impl.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("/client")
public class ClientsController {
    @Autowired
    private IClientService clientService;
    @ModelAttribute("client")
    public Client client() {
        return new Client();
    }
    @GetMapping("/lister")
    public ModelAndView lister() {
        return new ModelAndView("client", "clients", clientService.findAll());
    }
    @GetMapping("/lister/{n}")
    public ModelAndView lister(@PathVariable("n") Integer n) {
        Optional<Client> client = clientService.findById(n);
        return new ModelAndView("detailClient", "client", client.orElse(null));
    }
    @PostMapping("/creer")
    public String creer(@ModelAttribute("client") Client client) {
        clientService.save(client);
        return "redirect:/client/lister";
    }
    @PostMapping("/editer")
    public ModelAndView editer(Client client) {
        return new ModelAndView("modifierClient", "client", client);
    }
    @PostMapping("/editer/submit")
    public String submit(Client client) {
        clientService.save(client);
        return "redirect:/client/lister";
    }
    @PostMapping("/effacer")
    public String effacer(@RequestParam("idClient") Integer id) {
        clientService.delete(id);
        return "redirect:/client/lister";
    }
}
