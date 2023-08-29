import java.util.Scanner;

public class suitcase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		
		switch (numero) { case 0: System.out.println("O numero é 0");
		break; 
		case 1: System.out.println("O numero é 1");
		break;
		default: System.out.println("numero não encontrado");
		break;
		}

	}

}
