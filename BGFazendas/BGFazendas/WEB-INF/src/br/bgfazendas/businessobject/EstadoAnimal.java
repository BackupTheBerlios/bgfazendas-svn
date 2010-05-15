package br.bgfazendas.businessobject;
/**
 * Ex: Vivo, Morto, Vendido, Em Negociação, Doente e etc...
 * @author Brunno de Almeida Santos
 *
 */
public class EstadoAnimal {
	private int id=-1;
	private String nome;
	public EstadoAnimal() {
	
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
