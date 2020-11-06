package com.uff.trab.projetodeSoftware.repository;

import com.uff.trab.projetodeSoftware.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

    Cliente findByCpf(int cpf);
}
