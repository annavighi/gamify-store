package com.generation.gamifystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.gamifystore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
