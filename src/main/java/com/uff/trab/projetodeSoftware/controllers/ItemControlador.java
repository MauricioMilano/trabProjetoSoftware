package com.uff.trab.projetodeSoftware.controllers;

import com.uff.trab.projetodeSoftware.models.Item;
import com.uff.trab.projetodeSoftware.services.ItemServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemControlador {
    @PostMapping("/cadastroItem")
    public void cadastrarProduto(@RequestBody Item item) {
        System.out.println("ItemControlador :: cadastrarItem :: Entrou item" + item.toString());
        ItemServico itemServico = new ItemServico();
        itemServico.cadastroItem(item);
    }
}
