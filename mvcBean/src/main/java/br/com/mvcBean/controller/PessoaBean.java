package br.com.mvcBean.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.mvcBean.model.Pessoa;

public class PessoaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private Pessoa pessoa;
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private int idSequencia = 1;
	
	public String adicionar() {
		pessoa.setId(this.gerarId());
		pessoas.add(pessoa);
		System.out.println("Tamanho da lista " + pessoas.size());
		pessoa = new Pessoa();
		return null;
	}
	
	private int gerarId() {
		return idSequencia++;
	}
	
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	
	
}
