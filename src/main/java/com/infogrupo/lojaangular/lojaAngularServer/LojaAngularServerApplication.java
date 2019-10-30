package com.infogrupo.lojaangular.lojaAngularServer;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infogrupo.lojaangular.lojaAngularServer.model.Produto;
import com.infogrupo.lojaangular.lojaAngularServer.repository.ProdutoRepository;

@SpringBootApplication
public class LojaAngularServerApplication implements CommandLineRunner 	 	 {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LojaAngularServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto(null, "Televisão", 10, "Sem", "sem");
		Produto p2 = new Produto(null, "Computador", 10, "Sem", "sem");
		Produto p3 = new Produto(null, "Geladeira", 10, "Sem", "sem");
		Produto p4 = new Produto(null, "Fogão", 10, "Sem", "sem");
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
	}

}
