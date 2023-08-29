import java.util.Scanner;

public class gemeos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Em que ano o 1 irmão nasceu");
		int irmao1 = input.nextInt();
		System.out.println("Em que ano o 2 irmão nasceu");
		int irmao2 = input.nextInt();
		System.out.println("Em que ano o 3 irmão nasceu");
		int irmao3 = input.nextInt();
		
		if (irmao1 == irmao2 && irmao2 == irmao3) {System.out.println("Trigêmeos");}
		else if (irmao1 == irmao2 && irmao2 != irmao3) {System.out.println("Gêmeos");}
		else if (irmao1 == irmao3 && irmao3 != irmao2) {System.out.println("Gêmeos");}
		else if (irmao2 == irmao3 && irmao1 != irmao2) {System.out.println("Gêmeos");}
		else if (irmao1 != irmao2 && irmao2 != irmao3) {System.out.println("Apenas irmãos");}

	}

}
