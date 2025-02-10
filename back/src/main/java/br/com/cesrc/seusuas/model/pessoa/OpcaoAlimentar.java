package br.com.cesrc.seusuas.model.pessoa;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Entity;
import lombok.*;


public enum OpcaoAlimentar {
    VEGETARIANO, VEGANO, HALAL, KOSHER, SEM_LATICINIOS, SEM_OVOS, PESCATARIANO
}
