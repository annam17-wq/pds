package modelo;

public class Animal {
	private int id;
	private String nome;
	private String especie;
	private String pelagem;
	private String temperamento;
	private String nascimento;
	private String sobre;
	private String endereco;

// Estudante NOVO: o id fica 0 porque quem gera o id e o banco.

	public Animal(String nome, String especie, String pelagem, String temperamento, String nascimento, String sobre,
			String endereco) {
		this(0, nome, especie, pelagem, temperamento, nascimento, sobre, endereco);
	}

// Estudante que VEIO do banco: o id ja existe.
	public Animal(int id, String nome, String especie, String pelagem, String temperamento, String Nascimento,
			String sobre, String endereco) {
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.pelagem = pelagem;
		this.temperamento = temperamento;
		this.nascimento = nascimento;
		this.sobre = sobre;
		this.endereco = endereco;
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

	public String toString() {
		return String.format(
				"IdAnimal[id=%d, Nome=%s, Especie=%s,  Pelagem=%s,  Temperamento=%s,  Data de nascimento=%s,  Sobre=%s,  Endereço=%s ]",
				id, nome, especie, pelagem, temperamento, nascimento, sobre, endereco);
	}
}