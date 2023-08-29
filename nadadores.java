import java.util.Scanner;

public class nadadores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("qual a idade do nadador(a): ");
		int idade = input.nextInt();
		
		if (idade >= 5 && idade <= 7) {System.out.println("nadador pré-mirim");}
		if (idade >= 8 && idade <= 10) {System.out.println("nadador mirim");}
		if (idade >= 11 && idade <= 13) {System.out.println("nadador infantil");}
		if (idade >= 14 && idade <= 17) {System.out.println("nadador infanto-juvenil");}
		if (idade >= 18 && idade <= 20) {System.out.println("nadador juvenil");}
		if (idade >= 21 ) {System.out.println("nadador adulto");}
	}

}
