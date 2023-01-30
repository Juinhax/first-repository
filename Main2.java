package pratica_1;

import java.util.Locale;

public class Main2 {
	
	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x );
	}
}
