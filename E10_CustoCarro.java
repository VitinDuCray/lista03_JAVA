package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E10_CustoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Digite o custo de fábrica do carro:");
		int custoFabrica = sc.nextInt();
		
		double perDistribuidor = 0.28 * custoFabrica;
		double perImpostos = 0.45 * custoFabrica;
		double custoFinal = custoFabrica + perDistribuidor + perImpostos;
		
		System.out.println("O custo final ao consumidor é igual a: R$" + df.format(custoFinal));
		
		sc.close();
	}

}
