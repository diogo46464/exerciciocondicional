package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int I =sc.nextInt();
		int F =sc.nextInt();
		
		int duracao;
		
		if(I < F) {
			duracao = F-I;
		}
		else {
			duracao = 24 - I + F;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
     sc.close();
	}

}
