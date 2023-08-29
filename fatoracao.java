import java.util.Scanner;

public class fatoracao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fatorial = 1; 
		
		System.out.println("insira o número que você deseja achar o fatorial");
		int numero = input.nextInt();
		
		for ( int i = 1; i <= numero; i++) { fatorial = fatorial * i;
		}
		 System.out.println("o fatorial é: "+fatorial);
		}
	}


