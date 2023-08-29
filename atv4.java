import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira o valor do raio: ");
		int raio = input.nextInt(); 
		System.out.println("A circuferencia é: "+raio*raio*Math.PI);

	}

}