package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorio {
    public Cliente cadastroCliente(Cliente cliente){
        // código de chegar no banco
        System.out.println("ClienteRepositorio :: cadastroCliente :: Entrou cliente" + cliente.toString());
        return cliente;
    }
}
