import java.util.Scanner;

public class generos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o seu caracter");
		char genero = input.next().charAt(0);
		genero = Character.toUpperCase(genero);
		if (genero == 'M') { System.out.println("Masculino");}
		else if (genero == 'F') { System.out.println("Feminino");}
		else if (genero == 'I') { System.out.println("Não Informado");}
		else {System.err.println("Entrada incorreta");}
				

	}

}
