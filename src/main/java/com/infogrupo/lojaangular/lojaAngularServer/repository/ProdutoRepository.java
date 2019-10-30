package com.infogrupo.lojaangular.lojaAngularServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infogrupo.lojaangular.lojaAngularServer.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
