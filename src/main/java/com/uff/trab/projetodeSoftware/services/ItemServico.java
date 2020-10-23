package com.uff.trab.projetodeSoftware.services;

import com.uff.trab.projetodeSoftware.models.Item;
import com.uff.trab.projetodeSoftware.repository.ItemRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ItemServico {
    private ItemRepositorio itemRepositorio;

    public void cadastroItem(Item item) {
        System.out.println("ItemServico :: cadastroItem :: Entrou item " + item.toString());
        this.itemRepositorio = new ItemRepositorio();
        this.itemRepositorio.cadastroItem(item);
    }
}
