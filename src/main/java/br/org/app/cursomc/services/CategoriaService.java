package br.org.app.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.app.cursomc.domain.Categoria;
import br.org.app.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj.orElse(null);
	}

}
