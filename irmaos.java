import java.util.Scanner;

public class irmaos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira a idade de Marquinhos: ");

		int idM = input.nextInt();

		System.out.println("Insira a idade de Zezinho: ");

		int idZ = input.nextInt();

		System.out.println("Insira a idade de Luluzinha: ");

		int idL = input.nextInt();

		if (idM > idZ && idZ > idL)

		{

			System.out.println("Marquinhos � o irm�o mais velho, Zezinho o do meio, e Luluzinha a ca�ula");

		}

		if (idM > idL && idL > idZ) {

			System.out.println("Marquinhos � o irm�o mais velho, Luluzinha o do meio, e Zezinho o ca�ula");

		}

		if (idL > idM && idM > idZ) {

			System.out.println("Luluzinha � a irm� mais velha, Marquinhos o do meio, e Zezinho o ca�ula");

		}

		if (idL > idZ && idZ > idM) {

			System.out.println("Luluzinha � a irm� mais velha, Zezinho o do meio, e Marquinhos o ca�ula");

			if (idZ > idM && idM > idL)

				System.out.println("Zezinho � o irm�o mais velho, Marquinhos o do meio, e Luluzinha a ca�ula");

			if (idZ > idL && idL > idM)

				System.out.println("Zezinho � o irm�o mais velho, Luluzinha a do meio, e Marquinhos o ca�ula");

		}

	}

}