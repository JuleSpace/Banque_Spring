package com.limayrac.banque.service.impl;

import com.limayrac.banque.model.Compte;
import com.limayrac.banque.repository.CompteRepository;
import com.limayrac.banque.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompteService implements ICompteService {
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public Optional<Compte> findById(Integer id) {
        return compteRepository.findById(id);
    }
    @Override
    public Iterable<Compte> findAll() {
        return compteRepository.findAll();
    }
    @Override
    public Compte save(Compte compte) {
        return compteRepository.save(compte);
    }
    @Override
    public void delete(Integer id) {
        compteRepository.deleteById(id);
    }
    @Override
    public void delete(Compte compte) {
        compteRepository.delete(compte);
    }
}
