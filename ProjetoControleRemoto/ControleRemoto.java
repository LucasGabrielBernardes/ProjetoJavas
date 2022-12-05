package Encapsulamento;

public class ControleRemoto implements controlador {

	// atributos

	private int volume;
	private boolean ligado;
	private boolean tocando;

	// metodos especias

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return this.volume;
	}

	private boolean getLigado() {
		return this.ligado;

	}

	private boolean getTocando() {
		return this.tocando;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// metodos abstrato

	@Override
	public void ligar() {
		this.setLigado(true);

	}

	@Override
	public void desligar() {
		this.setLigado(false);

	}

	@Override
	public void abrirmenu() {
		System.out.println("-------Menu-------");
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta tocando? " + this.getTocando());
		System.out.print("Volume: " + getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechado menu!");

	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			this.setVolume(getVolume() + 5);
		} else {
			System.out.println("impossivel almentra volume");
		}

	}

	@Override
	public void menosVolume() {
		if (this.getLigado() == true) {
			this.setVolume(getVolume() - 5);
		} else {
			System.out.println("Impossivel diminuir volume");
		}

	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && getVolume() > 0) {
			this.setVolume(0);
		}

	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && getVolume() == 0) {
			this.setVolume(50);
		}

	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir");
		}

	}

	@Override
	public void puase() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}

	}

}
