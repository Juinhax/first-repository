package entrada_de_dados;
// para ler um texto até a quebra de linha

import java.util.Scanner; 

public class Main7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}
}
