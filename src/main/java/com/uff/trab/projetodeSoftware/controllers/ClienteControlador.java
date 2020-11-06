package com.uff.trab.projetodeSoftware.controllers;
import com.uff.trab.projetodeSoftware.models.Cliente;
import com.uff.trab.projetodeSoftware.services.ClienteServico;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClienteControlador {
    ClienteServico clienteServico = new ClienteServico();
    @PostMapping("/cliente/cadastro")
    public ResponseEntity cadastrarCliente(@RequestBody Cliente cliente){
        System.out.println("ClienteControlador :: cadastrarCliente :: Entrou cliente" + cliente.toString());
        Cliente clienteGerado = clienteServico.cadastroCliente(cliente);
        return new ResponseEntity<Cliente>(clienteGerado, HttpStatus.OK);
    }
    @PostMapping("/cliente/reclamacao")
    public void reclamacaoCliente(@RequestBody String reclamacao, @RequestHeader int documento){
        System.out.println("ClienteControlador :: reclamacaoCliente :: Entrou cliente" );
//        clienteServico.registraReclamacao(documento, reclamacao);
    }

}
