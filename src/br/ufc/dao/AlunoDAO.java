package br.ufc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.model.Aluno;

@Repository
public class AlunoDAO implements IAlunoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public void adicionar(Aluno aluno) {
		this.manager.persist(aluno);
	}

	@Override
	public void remover(Aluno aluno) {
		Aluno alunoRef = this.manager.find(Aluno.class, aluno.getId());
		this.manager.remove(alunoRef);
	}

	@Override
	public void alterar(Aluno aluno) {
		this.manager.merge(aluno);
	}

	@Override
	public List<Aluno> listar() {
		String hql = "Select a from Aluno a";
		return this.manager.createQuery(hql,Aluno.class).getResultList();
	}

}
