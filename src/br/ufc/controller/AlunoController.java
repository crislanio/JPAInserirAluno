package br.ufc.controller;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufc.dao.IAlunoDAO;
import br.ufc.model.Aluno;

@Transactional
@Controller
public class AlunoController {

	@Autowired
	private IAlunoDAO alunoDAO;
	
	@RequestMapping("formularioAluno")
	public String formularioAluno() {
		return "aluno/inserir_aluno";
	}

	@RequestMapping("listarAlunos")
	public String listar(Model model){
		List<Aluno> alunos = this.alunoDAO.listar();
		model.addAttribute("alunos", alunos);
		model.addAttribute("qtd", alunos.size());
		return "aluno/listar_alunos";
	}
	
	@RequestMapping("adicionarAluno")
	public String adicionarContato(@Valid Aluno aluno, BindingResult result) {

		if (result.hasErrors()) {
			return "inserir_aluno";
		}

		this.alunoDAO.adicionar(aluno);

		return "aluno/aluno_adicionado";
	}
	@RequestMapping("deletarAluno")
	public String remover(Aluno a) {
	
		this.alunoDAO.remover(a);	
		return "redirect:listarAluno";
	}
}
