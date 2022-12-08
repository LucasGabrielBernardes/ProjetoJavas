package auala11;

public class Bolsista extends Aluno {
   
	private int bolsa;
	
	public void RenovarBolsa() {
		System.out.println(" Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + "é bolsista! pagamento de mensalidade");
	}
	
	public int getBolsa() {
		return bolsa;
	}
	
	public void setBolsa( int bols) {
		this.bolsa = bols;
	}
}
