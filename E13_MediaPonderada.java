package lista03;

import java.util.Scanner;

public class E13_MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		int nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota:");
		int nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota:");
		int nota3 = sc.nextInt();
		
		int mediaFinal = ((nota1) * 2 + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média final é:" + mediaFinal);
		
		sc.close();
	}

}
