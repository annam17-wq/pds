package model;

/**
 * MODEL - so os dados de um estudante.
 *
 * Nao tem import nenhum. Nao sabe que existe tela nem banco.
 */
public class Animal {
	private String nome;
	private String especie;
	private String pelagem;
	private String temperamento;
	private String nascimento;
	private String sobre;
	private String endereco;
	private String buscar;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

// this.nome = o ATRIBUTO; nome sozinho = o PARAMETRO que chegou.
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBuscar() {
		return buscar;
	}

	public void setBuscar(String buscar) {
		this.buscar = buscar;
	}


}