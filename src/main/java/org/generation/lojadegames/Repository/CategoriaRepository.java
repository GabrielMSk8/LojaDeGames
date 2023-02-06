package org.generation.lojadegames.Repository;

import java.util.List;

import org.generation.lojadegames.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByGeneroContainingIgnoreCase(String genero);

}


