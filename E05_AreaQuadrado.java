package lista03;

import java.util.Scanner;

public class E05_AreaQuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora - Área do Quadrado");
		System.out.println("Digite o valor do lado do quadrado:");
		int lado = sc.nextInt();
		System.out.println("Á area do quadrado é: " + (lado * lado) + ".");
		
		sc.close();
	}

}
