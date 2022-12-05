package lutadorGuanabara;

import java.util.Random;

public class Luta {
	// atributos

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;

	// metodos public

	public void marcaLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l1.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovado) {
			System.out.println("### Deafiado");
			this.desafiado.apresentar();
			System.out.println("### Desafiante");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println(" ====== resultado da luta ====="); 
			switch (vencedor) {
			
			case 0:
				System.out.println(" Empatou ");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;

			case 1:
				System.out.println(" Vitoria do  " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;

			case 2:
				System.out.println(" Vitoria do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;

			}
			System.out.println("===============================");

		} else {
			System.out.println(" A luta nao pode acontecer! ");
		}
	}

	// metodos especias

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
