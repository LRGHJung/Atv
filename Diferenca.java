import java.util.Scanner;

public class Diferenca {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Insira o valor A: ");
			int valorA = input.nextInt();
			System.out.println("Insira o valor B: ");
			int valorB = input.nextInt();
			System.out.println("Insira o valor C");
			int valorC = input.nextInt();
			System.out.println("Insira o valor D");
			int valorD = input.nextInt();
			
		int valorAD = valorA*valorB;
		int valorCD = valorC*valorD;
		int diferenca = valorAD-valorCD; 
		
		System.out.println("A diferença é: "+diferenca);

	}

}
