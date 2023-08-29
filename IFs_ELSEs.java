import java.util.Scanner;

public class IFs_ELSEs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero");
		int n1 = input.nextInt();
		System.out.println("Escreva o segundo numero");
		int n2 = input.nextInt(); 
		
		if (n1 > n2) {System.out.println(n1+" é maior que "+n2);} 
		else {System.out.println(n2+" é maior que "+n1);}

	}

}
