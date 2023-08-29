import java.util.Scanner;

public class alunos2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int alunos20 = 0;
		String alunos18 = "";

		System.out.println("insira seu primeiro nome: ");
		String nome = input.next();
		System.out.println("insira sua idade (insira 0 para parar): ");
		int idade = input.nextInt();
		while (idade != 0) {
			if (idade > 20) {
				alunos20++;
			}
			if (idade == 18) {
				alunos18 = alunos18 + " " + nome;
			}
			System.out.println("insira seu primeiro nome: ");
			nome = input.next();
			System.out.println("insira sua idade (insira 0 para parar): ");
			idade = input.nextInt();

		}
		System.out.println("A quantidade de alunos com mais de 20 anos é " + alunos20
				+ ", o nome dos alunos com dezoito é " +alunos18);

	}

}
