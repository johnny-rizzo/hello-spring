package org.generation.blogPessoal.Repository;

import java.util.List;

import org.generation.blogPessoal.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public List<Tema> findALLByDescricaoContainingIgnoreCase(String descricao);
	

}
