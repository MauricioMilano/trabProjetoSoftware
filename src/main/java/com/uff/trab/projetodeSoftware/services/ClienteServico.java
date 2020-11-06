package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.models.Cliente;
import com.uff.trab.projetodeSoftware.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Repository
@Service
public class ClienteServico {
    @Autowired
    private ClienteRepositorio clienteRepositorio ;

    @Transactional
    public Cliente cadastroCliente(Cliente cliente){
        System.out.println("ClienteServico :: cadastroCliente :: Entrou cliente" + cliente.toString());
        try{
            Cliente clienteCriado = clienteRepositorio.save(cliente);
            return clienteCriado;
        }catch (Exception err){
            System.out.println("ClienteServico :: cadastroCliente :: Erro: " +  err.toString());
            return null;
        }
    }
}

