package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepositorio {
    public Item cadastroItem(Item item){
        //codigo de chegar no banco
        System.out.println("ItemRepositorio :: cadastroItem :: Entrou item" + item.toString());
        return item;//return devera ser return do bd, para confirmar que foi feito insert
    }
}
