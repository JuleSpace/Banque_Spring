package com.limayrac.banque.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer solde;
    private Double taux;
    @ManyToOne
    @JoinColumn(name = "id_client")
    @JsonBackReference
    private Client client;

}
