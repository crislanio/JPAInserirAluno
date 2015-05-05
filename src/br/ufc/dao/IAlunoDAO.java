package br.ufc.dao;

import java.util.List;

import br.ufc.model.Aluno;

public interface IAlunoDAO {
	public void adicionar(Aluno aluno);
	public void remover(Aluno aluno);
	public void alterar(Aluno aluno);
	public List<Aluno> listar();
}
