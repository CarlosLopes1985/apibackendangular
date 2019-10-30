package com.infogrupo.lojaangular.lojaAngularServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogrupo.lojaangular.lojaAngularServer.model.Produto;
import com.infogrupo.lojaangular.lojaAngularServer.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto>listarProdutos(){
		
		return produtoRepository.findAll();
	}
}
