package visibilidadeContaBanco;

public class contaBanco {

	// atributos

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// metodos
	
	public void estadoAtual() {
		System.out.println("---------------------------------");
		System.out.println("conta: " + this.getNumConta());
		System.out.println("tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
	    System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.setSaldo(50);
		} else if (t == "cp") {
			this.setSaldo(150);
		}
		System.out.println("conta aberta com sucesso!!");

	}

	public void fecharConta() {

		if (saldo > 0) {
			System.out.println("Conta com dinheiro!! ");
		} else if (saldo < 0) {
			System.out.println("Conta em debito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}

	}

	public void depositar(float v) {
		if (this.getStatus() == true) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta " + getDono());
		} else {
			System.out.println("impossivel depositar ");
		}

	}

	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + getDono());
			} else {
				System.out.println("saldo insuficiente para sacar");

			}
		} else {
			System.out.println("imposivel sacar de uma conta fechada");

		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v = 12;
		} else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossivel pagar uma conta fechada");
		}

	}

	// metodos especiais

	public contaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getTipo() {

		return tipo;
	}

	public void setDono(String c) {
		this.dono = c;
	}

	public String getDono() {
		return dono;
	}

	public void setSaldo(float d) {
		this.saldo = d;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setStatus(boolean e) {
		this.status = e;
	}

	public boolean getStatus() {
		return status;
	}

}
