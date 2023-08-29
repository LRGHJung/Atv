import java.util.Scanner;

public class reajuste_funcionarios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A quantos meses vc está trabalhando");
		int meses = input.nextInt();
		
		
		if (meses < 12) {System.out.println("Voce recebera 5% de reajuste");}
		if (meses >= 13 && meses <= 48) { System.out.println("Voce recebera 7% de reajuste");}

	}

}
