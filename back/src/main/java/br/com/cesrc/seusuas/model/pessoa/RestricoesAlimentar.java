package br.com.cesrc.seusuas.model.pessoa;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


public enum RestricoesAlimentar {
    GLUTEN, LACTOSE, ACUCAR, FRUTOS_DO_MAR, NOZES, AMENDOIM, OVO, SOJA, BAIXO_SODIO,
    }
