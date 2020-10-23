package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.models.Produto;
import com.uff.trab.projetodeSoftware.repository.ProdutoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServico {
    private ProdutoRepositorio produtoRepositorio;

    /*public void cadastroProduto(Produto produto) {
        System.out.println("ProdutoServico :: cadastroProduto :: Entrou produto " + produto.toString());
        this.produtoRepositorio = new ProdutoRepositorio();
        this.produtoRepositorio.cadastroProduto(produto);
    }*/
}
