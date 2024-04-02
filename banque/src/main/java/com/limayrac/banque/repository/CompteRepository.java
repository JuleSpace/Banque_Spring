package com.limayrac.banque.repository;

import com.limayrac.banque.model.Compte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends CrudRepository<Compte, Integer> {
}
