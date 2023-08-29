import java.text.DecimalFormat;
import java.util.Scanner;

public class horas_extras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("quanto você ganha por hora: ");
		double salario = input.nextDouble();
		System.out.println("quantas horas você trabalhou esse mês: ");
		double horas = input.nextDouble();
		double salariof = horas*salario;
		double horae  = salario*0.5; 
		
		if (horas == 160) {System.out.println("Você recebera: "+salariof);}
		if (horas > 160) {System.out.println("Você recebera: "+ (salariof+horae) );}
		

	}

}
