package lista03;

import java.util.Scanner;
	public class E04_AreaTriangulo {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Calculadora - Área de Triângulo");
			System.out.println("Digite a base:");
			int base = sc.nextInt();
			System.out.println("Digite a altura:");
			int altura = sc.nextInt();
			double area = (base * altura) / 2.0;
			System.out.println("A área do triângulo é: " + area + ".");
			sc.close();
	}
}
