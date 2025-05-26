package lista03;

import java.util.Scanner;

public class E07_IdadeExpressa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade expressa em dias");
		System.out.println("Quantos anos:");
		int anos = sc.nextInt();
		System.out.println("Quantos meses:");
		int meses = sc.nextInt();
		System.out.println("Quantos dias:");
		int dias = sc.nextInt();
		int anosDias = anos * 365;
		int mesesDias = meses * 30;
		int resultado = anosDias + mesesDias + dias;
		System.out.println("Você já viveu: " + resultado + " dias.");
		
		sc.close();
	}

}
