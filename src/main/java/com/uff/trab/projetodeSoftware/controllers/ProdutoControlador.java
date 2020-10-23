package com.uff.trab.projetodeSoftware.controllers;

import com.uff.trab.projetodeSoftware.models.Produto;
import com.uff.trab.projetodeSoftware.services.ProdutoServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControlador {
    @PostMapping("/cadastroProduto")
    public void cadastrarProduto(@RequestBody Produto produto) {
        System.out.println("ClienteControlador :: cadastrarCliente :: Entrou cliente" + produto.toString());
        ProdutoServico produtoServico = new ProdutoServico();
        /*produtoServico.cadastroProduto(produto);*/
    }
}
