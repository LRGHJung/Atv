import java.util.Scanner;

public class numeros_ate_mil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	   
		for (int i = 0; i <=4; i++) {System.out.println("insira um numero");
		int numero = input.nextInt();
		if (numero >= 0 && numero <= 1000) {System.out.println(numero);}}
		
	}

}
