package br.bgfazendas.businessobject;
/**
 * Ex: Equinos(cavalos), Suino, Bovino de Corte, Bovino de Leite
 * @author Brunno de Almeida Santos
 *
 */
public class TipoAnimal {
	private int id =-1;
	private String nome;
	public TipoAnimal() {
	
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
	
}
