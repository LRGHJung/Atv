import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a idade do homen 1");
		int homen1 = input.nextInt();
		System.out.println("qual a idade do homen 2");
		int homen2 = input.nextInt();
		System.out.println("qual a idade da mulher 1");
		int mulher1 = input.nextInt();
		System.out.println("qual a idade da mulher 2");
		int mulher2 = input.nextInt();
		
		if (homen1 > homen2 && mulher1 > mulher2 ) {System.out.println("A soma da: "+(homen1 + mulher2)+" "+"o produto fica: "+homen2*mulher1);}
		else if (homen1 < homen2 && mulher1 < mulher2 ) {System.out.println("A soma da: "+ (homen2 + mulher1)+" o produto fica: "+homen1*mulher2  );}

	}

}
