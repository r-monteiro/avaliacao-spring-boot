package br.com.tokiomarine.seguradora.avaliacao.repository;

//import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

	
	//List<Estudante> findByName(String nome);
}
