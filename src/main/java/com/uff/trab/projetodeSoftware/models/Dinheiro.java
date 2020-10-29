package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dinheiro {
    int valorAPagar;

    public float calcularTroco(float valorRecebido) {
//        System.out.println("Pagamento efetuado");
        return valorAPagar - valorRecebido;
    }
}
