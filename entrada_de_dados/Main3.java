package entrada_de_dados;
//para ler um número com ponto flutuante

import java.util.Scanner;
import java.util.Locale;

public class Main3 {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.println("Você digitou: " + x);
		// dá para colocar também: System.out.println("Você Digitou: %.2f%n", x);
		
		sc.close();
		
		
	}

}
