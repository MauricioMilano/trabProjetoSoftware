package com.uff.trab.projetodeSoftware.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Venda {
    private Integer identificador;
    //private Vendedor vendedor;
    private Cliente cliente;
    //private Status status;

    public void adicionarItem(Produto produto){
        //produto.create();
    }

    public void removerItem(Produto produto){
        //produto.delete();
    }

    public void finalizarVenda(){
        
    }

}
