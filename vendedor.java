import java.text.DecimalFormat;
import java.util.Scanner;

public class vendedor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	    
		System.out.println("Insira seu nome: ");
		String nome = input.next();
		System.out.println("Qual o seu salario (por mes):");
		double salario = input.nextDouble();
		System.out.println("Quantas vendas em R$ voce fez este mes:");
	    double vendas = input.nextDouble();
		
	    double comissao = vendas*0.15;
	    double salariofinal = salario+comissao;
	    
	    System.out.println("Voce recebera: " +df.format(salariofinal) );
		

	}

}
