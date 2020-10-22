package com.uff.trab.projetodeSoftware.controllers;
import com.uff.trab.projetodeSoftware.models.Cliente;
import com.uff.trab.projetodeSoftware.services.ClienteServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClienteControlador {

    @PostMapping("/cadastroCliente")
    public void cadastrarCliente(@RequestBody Cliente cliente){
        System.out.println("ClienteControlador :: cadastrarCliente :: Entrou cliente" + cliente.toString());
        ClienteServico clienteServico = new ClienteServico();
        clienteServico.cadastroCliente(cliente);

    }

}
