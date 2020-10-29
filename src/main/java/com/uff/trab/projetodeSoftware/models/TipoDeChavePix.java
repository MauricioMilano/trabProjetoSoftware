package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public enum TipoDeChavePix {
    CPF, CNPJ, Telefone, ChaveAleatoria;
}
