package com.limayrac.banque.repository;

import com.limayrac.banque.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
