package br.bgfazendas.businessobject;
/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
public class Vacina {
	private int id = -1;
	private String nome;
	private String descricao;
	public Vacina() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
