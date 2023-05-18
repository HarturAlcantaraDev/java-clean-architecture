package br.com.alura.escola.aplicacao.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositoryAluno;

public class MatricularAluno {

	private final RepositoryAluno repository;

	public MatricularAluno(RepositoryAluno repository) {
		this.repository = repository;
	}

	public void matricular(MatricularAlunoDto dados) {

		Aluno novo = dados.criarAluno();
		
		repository.matricular(novo);
	}

}
