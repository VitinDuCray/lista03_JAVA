package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E11_SalarioVendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$#,##0.00");
		
		System.out.println("Digite o números de carros vendidos:");
		int numeroCarros = sc.nextInt();
		System.out.println("Digite o valor total das vendas:");
		double totalVendas = sc.nextDouble();
		System.out.println("Digite o salário fixo do vendedor:");
		double salarioFixo = sc.nextDouble();
		System.out.println("Digite a comissão por carro vendido:");
		double comissaoPorCarro = sc.nextDouble();
		
		double comissaoCarros = numeroCarros * comissaoPorCarro;
		double comissaoPorVendas = 0.05 * totalVendas;
		
		double salarioFinal = salarioFixo + comissaoCarros + comissaoPorVendas;
		
		System.out.println("O salário final do vendedor é: " + df.format(salarioFinal));
		
		sc.close();
	}

}
