package com.limayrac.banque.service.impl;

import com.limayrac.banque.model.Client;
import com.limayrac.banque.repository.ClientRepository;
import com.limayrac.banque.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public void delete(Client client) {
        clientRepository.delete(client);
    }
    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
