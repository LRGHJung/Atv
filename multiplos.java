import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo numero");
		int n2 = input.nextInt();
		
		if (n1%n2 == 0) {System.out.println("Os numeros são multiplos");}
		
		else {System.out.println("Os numeros não são multiplos");}

	}

}
