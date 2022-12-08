package auala11;

public class Professor extends peesoa {
     
	private String specialidade ;
	private double salario;
	
	public void receberAumaneto() {
		System.out.println("o professor " + this.getNome() + "teve um grande aumento de salario");
	}
	
	public String getSpecialidade() {
		return specialidade;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSpecialidade(String vdo) {
		this.specialidade = vdo;
	}
	
	public void setSalario(double sala) {
		this.salario = sala;
	}
	
}
