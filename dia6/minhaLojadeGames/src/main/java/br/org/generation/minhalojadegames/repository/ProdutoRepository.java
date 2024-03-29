package br.org.generation.minhalojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.minhalojadegames.model.Categoria;
import br.org.generation.minhalojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);
	
	public List<Produto> findAllByCategoria(Categoria categoria);

}
