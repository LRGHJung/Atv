import java.util.Scanner;

public class frutas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("insira o nome de uma fruta: ");
		String fruta = input.next();

		switch (fruta) {
		case "banana":
			System.out.println(" eu gosto dessa fruta");
			break;
		case "uva":
			System.out.println("eu gosto dessa fruta ");
			break;
		case "laranja":
			System.out.println("eu gosto dessa fruta");
			break;
		case "tangerina":
			System.out.println("eu gosto dessa fruta");
			break;
		case "morango":
			System.out.println("eu n�o gosto dessa fruta");
			break;
		case "kiwi":
			System.out.println("eu n�o gosto dessa fruta");
			break;
		case "ma�a":
			System.out.println("eu gosto dessa fruta");
			break;
		default:
			System.out.println("eu n�o conhe�o essa fruta");
			break;

		}

	}

}
