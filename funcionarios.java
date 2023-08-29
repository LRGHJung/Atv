import java.text.DecimalFormat;
import java.util.Scanner;

public class funcionarios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira seu número: ");
		String numerofunc = input.next();
		
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		int horas = input.nextInt();
		
		System.out.println("Insira o quanto voce recebe por hora: ");
		double pagamento = input.nextDouble();
		
		System.out.println("Ganho por dia: "+pagamento*24);
		System.out.println("Ganho por semana: "+pagamento*168);
		System.out.println("Ganho por mes: "+pagamento*730.001);
	}

}
