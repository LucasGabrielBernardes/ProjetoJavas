package lutadorGuanabara;

public class Lutador {

	// atributos

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;;
	private int vitorias;
	private int derotas;
	private int empates;

	// metodos

	public void apresentar() {
		System.out.println("----------------------------------------------");
		System.out.println("CHEGOU A HORA! apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " +  this.getAltura() + " metros ");
		//System.out.println(getAltura() + "m altura");
		System.out.println(" Pesando: " + getPeso() + " KG ");
		System.out.println(" Ganhou: " + getVitorias());
		System.out.println(" Perdeu: " + getDerrotas());
		System.out.println(" Empates: " + getEmpates());
		System.out.println("-----------------------------------------------");

	}

	public void Status() {
       System.out.println(getNome() + " e um peso " + this.getCategoria());
       //System.out.println("e um peso " + getCategoria());
       System.out.println(getVitorias() + " Vitorias ");
       System.out.println(getDerrotas() + " Derrotas ");
       System.out.println(getEmpates() + " Empates ");
       System.out.println(" ");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
         this.setDerrotas(this.getDerrotas() + 1); 
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);

	}

	// metodos especias

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derotas = de;
		this.empates = em;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float al) {
		this.altura = al;
	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}

	public int getVitorias() {
		return this.vitorias;
	}

	public void setVitorias(int vi) {
		this.vitorias = vi;
	}

	public int getDerrotas() {
		return this.derotas;
	}

	public void setDerrotas(int de) {
		this.derotas = de;
	}

	public int getEmpates() {
		return this.empates;
	}

	public void setEmpates(int em) {
		this.empates = em;
	}

	public String getCategoria() {
		return this.categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {	
			this.categoria = "inavlido";
		} else if (this.peso <= 70.3) {
			this.categoria = "leve";
		}else if(this.peso <=83.9) {
			this.categoria = "media";			
		}else if (this.peso <= 120.2) {
			this.categoria = "pesado";
		} else {
			this.categoria = "invalido";
		}
	}

}
