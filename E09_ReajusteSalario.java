package lista03;

import java.util.Scanner;

public class E09_ReajusteSalario {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular Reajuste de Salário");
		System.out.println("Digite o seu salário atual:");
		double salario = sc.nextDouble();
		System.out.println("Digite o percentual de reajuste:");
		int reajuste = sc.nextInt();
		double novoSalario = salario + (salario * ((double)reajuste / 100));
		System.out.println("Seu novo salário pós reajuste é de: R$" + novoSalario);
		sc.close();
	}
}
