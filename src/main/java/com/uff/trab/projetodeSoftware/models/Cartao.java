package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {
    int valorAPagar;
    BandeiraDoCartao bandeira;

    public void contatarBandeira() {
//        valorAPagar = 0;
//        System.out.println("Pagamento efetuado");
    }
}
