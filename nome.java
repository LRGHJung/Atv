import java.util.Scanner;

public class nome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira o nome");
		String nome = input.next();
		
		if (nome.equalsIgnoreCase("Gabriel")) {System.out.println("nome correto");}
		else {System.out.println("nome incorreto");}
		
	}

}
