package com.uff.trab.projetodeSoftware.controllers;
import com.uff.trab.projetodeSoftware.models.Cliente;
import com.uff.trab.projetodeSoftware.models.Vendedor;
import com.uff.trab.projetodeSoftware.services.ClienteServico;
import com.uff.trab.projetodeSoftware.services.VendedorServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorControlador {

    @PostMapping("/login")
    public void login(@RequestBody Vendedor vendedor){
//        System.out.println("VendedorControlador :: login :: Tentando login de " + vendedor.toString());
//        VendedorServico vendedorServico = new VendedorServico();
    }

}
