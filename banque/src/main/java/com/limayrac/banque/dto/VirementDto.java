package com.limayrac.banque.dto;

import lombok.Data;

@Data
public class VirementDto {
    private Integer emetteur;
    private Integer beneficiaire;
    private Integer montant;
}