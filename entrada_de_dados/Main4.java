package entrada_de_dados;
//para ler um número com ponto flutuante 2

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", x);
		
		sc.close();
	}

}
