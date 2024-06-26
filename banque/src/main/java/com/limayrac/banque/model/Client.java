package com.limayrac.banque.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    private List<Compte> comptes;
    private Double decouvert = 0.0;

    // Implemente manuellement toString() si nécessaire, en excluant la propriété 'comptes'
}
