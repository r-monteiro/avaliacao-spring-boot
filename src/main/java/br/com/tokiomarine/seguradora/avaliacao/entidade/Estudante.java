package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="estudante")
public class Estudante {
	// TODO Implementar a entidade Estudante conforme solicitado

	protected Estudante() {}

	public Estudante(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private long id;
	
	@Column(name="nome")
	@NotNull(message = "Nome é obrigatório")
	private String nome;
	
	@Column(name="email")
	@NotNull(message = "Email é obrigatório")
	private String email;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="matricula")
	@NotNull(message = "Matrícula é obrigatório")
	private String matricula;
	
	@Column(name="curso")
	private String curso;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
