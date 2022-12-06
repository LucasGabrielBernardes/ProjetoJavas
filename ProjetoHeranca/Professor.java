package ProjetoHeranca;

public class Professor extends Pessoa {

	// atributos

	private String specialidade;
	private float salario;

	// metodos

	public void receberAum(float aum) {
		this.salario += aum;

	}

	// metodos especiais

	public String getSpecialidade() {
		return specialidade;
	}

	public void setSpecialidade(String especi) {
		this.specialidade = especi;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float sala) {
		this.salario = sala;
	}

}
