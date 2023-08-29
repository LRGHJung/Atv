import java.util.Scanner;

public class laco_de_repeticao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("insira o numero");
			int numero = input.nextInt();
			if (numero % 2 == 0) {System.out.println("numero par");}
			else {System.out.println("numero impar");}
		
		}

	}

}
