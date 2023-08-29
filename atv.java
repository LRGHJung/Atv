import java.util.Scanner;

public class atv {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
	System.out.println("Insira o valor da largura");
		int largura = input.nextInt();
		System.out.println("Insira o valor da altura");
		int altura = input.nextInt();
		int area = largura*altura;
		int perimetro = 2*(largura + altura);
		
		System.out.println("A área é: "+area);
		System.out.print("O perimetro é: "+perimetro);
		

		
	}

}
