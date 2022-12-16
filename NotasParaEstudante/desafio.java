package ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class desafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas: ");

		int qtNote = entrada.nextInt();

		double[] note = new double[qtNote];

		for (int i = 0; i < note.length; i++) {
			System.out.print("informe a nota " + (i + 1) + ": ");
			note[i] = entrada.nextDouble();
		}

		System.out.println(Arrays.toString(note));

		double total = 0;
		for (double notas : note) {
			total += notas;
		}
		
		double media = total / note.length;
		System.out.println("A media e " + media + " !");
		
		if (media >= 5 && media <= 10 ) {
			System.out.println("aluno aprovado ");
		} else if (media >= 10) {
			System.out.println(" Nota invalida verifique os dados usados ");
		}else {
			System.out.println("Aluno reprovado ");
		}

		entrada.close();
	}
}
