import java.text.DecimalFormat;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("insira a nota da 1 prova: ");
		double prova1 = input.nextDouble();
		System.out.println("insira a nota da 2 prova: ");
		double prova2 = input.nextDouble();
		System.out.println("insira a nota da 3 prova: ");
		double prova3 = input.nextDouble();
		System.out.println("insira a nota dos exercicios: ");
		double exercicios = input.nextDouble();
		
	    double media1 = prova1+prova2*2;
	    double media2 = prova3*3+exercicios;
	    double mediat = (media1+media2)/7;
	    if (mediat >= 9.0) {System.out.println("nota A: aprovado");}
	    if (mediat >= 7.5 && mediat < 9.0) {System.out.println("nota B: aprovado");}
	    if (mediat >= 6.0 && mediat < 7.5) {System.out.println("nota C: aprovado");}
	    if (mediat >= 4.0 && mediat <6.0) { System.out.println("nota D: reprovado");}
	    if (mediat < 4.0) {System.out.println("nota E: reprovado");}
	    
	    		
	    }
		
		
	}


