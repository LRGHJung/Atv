import java.util.Scanner;

public class gemeos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Em que ano o 1 irm�o nasceu");
		int irmao1 = input.nextInt();
		System.out.println("Em que ano o 2 irm�o nasceu");
		int irmao2 = input.nextInt();
		System.out.println("Em que ano o 3 irm�o nasceu");
		int irmao3 = input.nextInt();
		
		if (irmao1 == irmao2 && irmao2 == irmao3) {System.out.println("Trig�meos");}
		else if (irmao1 == irmao2 && irmao2 != irmao3) {System.out.println("G�meos");}
		else if (irmao1 == irmao3 && irmao3 != irmao2) {System.out.println("G�meos");}
		else if (irmao2 == irmao3 && irmao1 != irmao2) {System.out.println("G�meos");}
		else if (irmao1 != irmao2 && irmao2 != irmao3) {System.out.println("Apenas irm�os");}

	}

}
