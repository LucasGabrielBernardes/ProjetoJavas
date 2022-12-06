package ProjetoHeranca;

public class Aluno extends Pessoa {
	// atributos

	private int matri;
	private String curso;

	// metodos

	public void cancelarMatri() {
		System.out.println(" Matricula sera cancelada ");

	}

	// metodos especias

	public int getMatri() {
		return matri;
	}

	public void setMatri(int matri) {
		this.matri = matri;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
