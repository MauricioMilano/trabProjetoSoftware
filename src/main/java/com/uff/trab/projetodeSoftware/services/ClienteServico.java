package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.models.Cliente;
import com.uff.trab.projetodeSoftware.repository.ClienteRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ClienteServico {
    private ClienteRepositorio clienteRepositorio;
    public void cadastroCliente(Cliente cliente){
        System.out.println("ClienteServico :: cadastroCliente :: Entrou cliente" + cliente.toString());
        this.clienteRepositorio = new ClienteRepositorio();
        this.clienteRepositorio.cadastroCliente(cliente);

    }
}
