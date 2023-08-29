import java.text.DecimalFormat;
import java.util.Scanner;

public class alunos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("insira seu nome: ");
		String nome = input.next();
		while (!nome.equalsIgnoreCase("fim")) {
		System.out.println("Insira a 1 nota: ");
		double prova1 = input.nextDouble();
		System.out.println("Insira a 2 nota: ");
		double prova2 = input.nextDouble();
		System.out.println("sua média é "+ (prova1+prova2)/2);
		System.out.println("insira seu nome");
		nome = input.next();
		
 		} System.out.println("fim");
	}

}
