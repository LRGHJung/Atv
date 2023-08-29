import java.util.Scanner;

public class quadrante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor de X");
		int X = input.nextInt();
		System.out.println("Insira o valor de Y");
		int Y = input.nextInt();
		
		if (X > 0 && Y > 0) {System.out.println("Quadrante 1");}
		else if (X<0 && Y>0) {System.out.println("Quadrante 2");}
		else if (X<0 && Y<0) {System.out.println("Quadrante 3");}
		else if (X>0 && Y<0) {System.out.println("Quadrante 4");}
		else if (X==0) {System.out.println("Sobre o eixo X");}
		else if (Y==0) {System.out.println("Sobre o eixo Y");}
	}

}
