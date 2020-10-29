package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public enum BandeiraDoCartao {
    MasterCard, Maestro, Visa, Elo, Hipercard, AmericanExpress;
}
