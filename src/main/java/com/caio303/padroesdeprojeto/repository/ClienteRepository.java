package com.caio303.padroesdeprojeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.caio303.padroesdeprojeto.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {}