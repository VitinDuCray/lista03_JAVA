package lista03;

import java.util.Scanner;

public class E06_AreaCirculo {

	public static void main(String[]sargs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora - Área do Círculo");
		System.out.println("Digite o perimetro do círculo:");
		int perimetro = sc.nextInt();
		double raio = perimetro / 2.0;
		double pi = 3.14;
		double area = pi * (raio * raio);
		System.out.println("A área do círculo é: " + area + ".");
		
		sc.close();
	}

}
