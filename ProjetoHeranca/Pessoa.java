package ProjetoHeranca;

public class Pessoa {

	// atributo

	private String nome;
	private int idade;
	private String sexo;

	// metodos

	public void fazerAniver() {
		this.idade++;
	}

	// metodos especiais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "Pessoa { " + " nome = " + nome + ", idade " + idade + ", sexo " + sexo + "}";
	}

}
