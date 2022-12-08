package auala11;

public class Aluno extends peesoa {
	
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno " + this.getNome());
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setMatricula(int matri) {
		this.matricula = matri;
	}
	
	public void setCurso(String cur) {
		this.curso = cur;
	}
	

}
