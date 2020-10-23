package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Item;
import com.uff.trab.projetodeSoftware.models.Produto;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepositorio extends CrudRepository<Produto, Long> {
    @Query("select * from produto where nome =:name")
    List<Produto> findByName(@Param("nome") String nome);
    /*public Produto cadastroProduto(Produto produto){
        //codigo de chegar no banco
        System.out.println("ProdutoRepositorio :: cadastroProduto :: Entrou produto" + produto.toString());
        return produto;//return devera ser return do bd, para confirmar que foi feito insert
    }*/
}

