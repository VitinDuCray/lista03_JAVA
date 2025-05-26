package lista03;

import java.util.Scanner;

public class E12_Fahrenheint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F.");
        
        sc.close();
    }
}
