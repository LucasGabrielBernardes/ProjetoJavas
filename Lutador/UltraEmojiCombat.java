package lutadorGuanabara;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[6]; 
				
		l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 13, 0, 2);
		l[3] = new Lutador("Dead cod", "Australia", 28, 1.93f, 81.6f, 12, 1, 2);
		l[4] = new Lutador("danado", "Argentina", 39, 1.80f, 87.8f, 20, 0, 0);
		l[5] = new Lutador("estupido", "alemanha", 22, 1.50f, 84.8f, 28, 6, 9);
		
		Luta UEC01 = new Luta();
	    UEC01.marcaLuta(l[0], l[1]);
	    UEC01.lutar();
	    l[0].Status();
	    l[1].Status();
	}

}
