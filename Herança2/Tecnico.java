package auala11;

public class Tecnico  extends Aluno{
   
	private int registroProfissional;
	
	public void praticar() {
		System.out.println("o tecnico" + this.getNome() + " Registro" + this.getRegistroProfissional() +
				"esta disposto a melhorar a sua vida");
	}
	
	public int getRegistroProfissional() {
		return registroProfissional;
	}
	
	public void setRegistroProfissional(int tt) {
		this.registroProfissional = tt;
	}
}
