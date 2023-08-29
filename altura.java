import java.text.DecimalFormat;
import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");

		double media = 0;

		for (int i = 0; i <= 4; i++) {
			System.out.println("insira sua altura:");
			double altura = input.nextDouble();
			media = media + altura;
		
				
			} System.out.println(media/5);
		}

	}


