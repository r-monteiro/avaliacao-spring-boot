package br.com.tokiomarine.seguradora.avaliacao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;


@RestController
@RequestMapping("/estudantes/")
public class EstudanteRestController {

	private final EstudanteRepository repository;

	EstudanteRestController(EstudanteRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/{id}")
	public Estudante buscar(@PathVariable Long id) {
		Optional<Estudante> optional = this.repository.findById(id);
		Estudante estudante = null;
		if(optional.isPresent()) {
			estudante = optional.get();
		}else {
			throw new IllegalArgumentException("Identificador inválido:" + id);
		}

		return estudante;
	}

	@GetMapping
	public List<Estudante> pesquisar() {
		return this.repository.findAll();
	}

	@PutMapping
	public Estudante atualizar( @RequestBody Estudante estudante) {
		return this.repository.save(estudante);
	}

	@PostMapping
	public Estudante salvar(@RequestBody Estudante estudante) {
		return this.repository.save(estudante);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		this.repository.deleteById(id);
	}

}
