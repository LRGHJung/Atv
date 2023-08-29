import java.util.Scanner;

public class array_entrada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeros [] = new int [5];
		
		numeros[0] = 4;
	    numeros[1] = 8;
	    numeros[2] = 1;
	    numeros[3] = 7;
	    numeros[4] = 10;
	    
	    System.out.println("insira um numero: ");
	    int numero = input.nextInt();
	    if (numero == numeros[0] ) 
	    { System.out.println("O numero "+numero+" esta na array e esta na posição é 1");}
	    if (numero == numeros[1] ) 
	    { System.out.println("O numero "+numero+" esta na array e esta na posição é 2");}
	    if (numero == numeros[2] ) 
	    { System.out.println("O numero "+numero+" esta na array e esta na posição é 3");}
	    if (numero == numeros[3] ) 
	    { System.out.println("O numero "+numero+" esta na array e esta na posição é 4");}
	    if (numero == numeros[4] ) 
	    { System.out.println("O numero "+numero+" esta na array e esta na posição é 5");}
	    if (numero != numeros[0] & numero != numeros[1] & numero != numeros [2] & numero != numeros[3] & numero != numeros[4]) {System.out.println("o numero não esta na array");}
	    	
	    	

	}

}
