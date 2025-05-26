package lista03;

import java.util.Scanner;

public class E01_Antecessor {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Algoritmo - Número Antecessor");
		System.out.println("Digite o número: ");
		int numero = sc.nextInt();
		int antecessor = numero - 1;
		System.out.println("O antecessor de " + numero + " é: " + antecessor + ".");
		
		sc.close();
	}
}
