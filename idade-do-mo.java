package idade_do_mo;

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("digite o ano do mo: ");
		int ano = sc.nextInt();
		System.out.print("digite o ano atual: ");
		int ano2 = sc.nextInt();
		int subtracao = (ano2 - ano);
		// = : se lê recebe
		System.out.println(subtracao);
		
		sc.close();
		
	}
}
