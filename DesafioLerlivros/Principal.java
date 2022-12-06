package DesafioLerlivros;

public class Principal {
	
	public static void main(String[] args) {
		Pessoas [] p = new Pessoas[2];
		Livro [] l = new Livro [3];
		
		
		p[0] = new Pessoas("Pedro", 22, "M");
		p[1] = new Pessoas("Maria", 25, "F");
		
		l[0] = new Livro("Aprendendo Java", "jose silva", 300, p[0]);
		l[1] = new Livro("Poo para iniciante ", "Pedro paulo", 500, p[1]);
		l[2] = new Livro("Java avancado", "Maria", 800, p[0]);
		
		System.out.println(l[0].detalhes());
	}

}
