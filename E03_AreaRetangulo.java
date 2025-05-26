package lista03;

import java.util.Scanner;

public class E03_AreaRetangulo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora - Área de Retângulo");
		System.out.println("Digite a base:");
		int base = sc.nextInt();
		System.out.println("Digite a altura:");
		int altura = sc.nextInt();
		int area = base * altura;
		System.out.println("A área do retângulo é: " + area + ".");
		sc.close();
	}
}
