package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		if(N >= 0) {
			System.out.println("NÃO NEGATIVO" );
		}
		else {
			System.out.println("NEGATIVO");
		}
		
     sc.close();
	}

}
