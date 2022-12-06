package DesafioLerlivros;

public class Livro implements Publicacao {
	
	// atributo
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoas leitor;
	
	// metodos 
	
	public String detalhes() {
		return "Livro {" + "titulo = " + titulo + "\n, autor = "
				+ autor + ", Pagina atual = " + pagAtual + ", aberto = " 
				+ aberto + "\n, leitor = " + leitor.getNome() 
				+ ", idade = " + leitor.getIdade() 
				+ ", sexo = " + leitor.getSexo() + "' }";
		
	}
	

	public Livro(String titulo, String autor, int tota, Pessoas leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = tota;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
		
	
	// metodos especiais 
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotPaginas() {
		return totPaginas;
	}
	
	public void setTotPaginas(int tot) {
		this.totPaginas = tot;
	}
	
	public int gerPaginaAtual() {
		return pagAtual;
	}
	
	public void setPaginaAtual(int pagi) {
		this.pagAtual = pagi;
	}
	
	public boolean getAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aber) {
		this.aberto = aber;
	}
	
	public Pessoas getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Pessoas leit) {
		this.leitor = leit;
	}


	@Override
	public void abrir() {
		this.aberto = true;
	
	}


	@Override
	public void fechar() {
		this.aberto = false;
		
	}


	@Override
	public void folhar(int p) {
		if (p > this.totPaginas) {
			this.pagAtual = 0;
		} else {
			
			this.pagAtual = p;
		}
		
	}


	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}
	

}
