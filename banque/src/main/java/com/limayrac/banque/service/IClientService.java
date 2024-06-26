package com.limayrac.banque.service;

import com.limayrac.banque.model.Client;

import java.util.Optional;

public interface IClientService {
    Iterable<Client> findAll();

    Optional<Client> findById(Integer id);

    Client save(Client client);

    void delete(Client client);

    void delete(Integer id);
}
