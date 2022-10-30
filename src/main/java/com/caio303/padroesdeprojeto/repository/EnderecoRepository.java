package com.caio303.padroesdeprojeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.caio303.padroesdeprojeto.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {}