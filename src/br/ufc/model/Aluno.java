package br.ufc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="alunos")
public class Aluno {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String matricula;
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="nascimento")
	private Date nascimento;
	private String email;
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", matricula=" + matricula + ", nome="
				+ nome + ", nascimento=" + nascimento + ", email=" + email
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
