package entrada_de_dados;
//para ler um número inteiro

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x;
		x = sc.nextInt();
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}
}
