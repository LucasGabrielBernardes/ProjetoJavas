package auala11;

public  abstract class peesoa {
	
	//A ttibutos
	
	private String nome;
	private int idade;
	private String sexo;
	
	
	
	// metodos especiais 
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString () {
		return "Pessoa {" + "nome = " + nome + "idade = " + idade + "sexo = " + sexo;
  	}

}
