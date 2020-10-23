package com.uff.trab.projetodeSoftware;

import com.uff.trab.projetodeSoftware.models.Produto;
import com.uff.trab.projetodeSoftware.repository.ProdutoRepositorio;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ProdutoRepositorio produtoRepositorio) {
        return args -> {
            //Produto produto1 = Produto.create(12, "Mouse", 156.20f, 456789, "Casa do Ze", 2);

            //ystem.out.println(produtoRepositorio.save(produto1));
        };
    }

}
