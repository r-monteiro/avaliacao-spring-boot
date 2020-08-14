package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;

// TODO Efetue a implementação dos métodos da classe service
@Service
public class EstudanteServiceImpl implements EstudanteService {

	@Autowired
	EstudanteRepository repository;

	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {
		this.repository.save(estudante);
	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		this.repository.save(estudante);
	}

	@Override
	public List<Estudante> buscarEstudantes() {
		return this.repository.findAll();
	}

	@Override
	public Estudante buscarEstudante(long id) {
		Optional<Estudante> optional = this.repository.findById(id);
		Estudante estudante = null;
		if(optional.isPresent()) {
			estudante = optional.get();
		}else {
			throw new IllegalArgumentException("Identificador inválido:" + id);			
		}
		
		return estudante;
	}

}
