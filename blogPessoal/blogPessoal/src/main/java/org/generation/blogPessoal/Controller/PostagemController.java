package org.generation.blogPessoal.Controller;

import java.util.List;

import org.generation.blogPessoal.Model.Postagem;
import org.generation.blogPessoal.Repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Postagem")
@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;
	@GetMapping
	public ResponseEntity <List<Postagem>> getAll(){
	return ResponseEntity.ok(repository.findAll());
	
	}
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> getbyid(@PathVariable long Id){
		return repository.findById(Id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
}
	@GetMapping("/titulo/{titulo}")	
	public ResponseEntity<List<Postagem>> getbytitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	
	}
	
}
