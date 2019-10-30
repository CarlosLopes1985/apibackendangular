package com.infogrupo.lojaangular.lojaAngularServer.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infogrupo.lojaangular.lojaAngularServer.model.Produto;
import com.infogrupo.lojaangular.lojaAngularServer.service.ProdutoService;

@RestController(value="/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Produto>> find() {
		List<Produto> obj = produtoService.listarProdutos();
		return ResponseEntity.ok().body(obj);
	}
}
