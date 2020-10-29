package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pix {
    int valorAPagar;
    int chave;
    TipoDeChavePix tipoDaChave;

    public void realizarPagamento() {
//        valorAPagar = 0;
//        System.out.println("Pagamento efetuado");
    }
}
