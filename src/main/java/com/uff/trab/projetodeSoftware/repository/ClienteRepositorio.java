package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorio {
    public static Cliente cadastroCliente(Cliente cliente){
        // código de chegar no banco
        System.out.println("ClienteRepositorio :: cadastroCliente :: Entrou cliente" + cliente.toString());
        return cliente;
    }
    public static Cliente atualizarCliente(Cliente cliente){
        // código de chegar no banco
        System.out.println("ClienteRepositorio :: atualizarCliente :: Entrou cliente" + cliente.toString());
        return cliente;
    }

    public void registraReclamacao(int identidade, String reclamacao ){
        //TODO pegar parte implementada de usuario no lugar
        Cliente cliente = Cliente.builder().identidade(identidade).build();
        cliente.realizarReclamacao(reclamacao);
        return;
    }
}
