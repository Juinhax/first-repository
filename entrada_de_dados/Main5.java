package entrada_de_dados;
//para ler um caractere

import java.util.Scanner;

public class Main5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}
}