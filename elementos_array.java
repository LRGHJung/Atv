
public class elementos_array {

	public static void main(String[] args) {
		int numero[] = new int[5];
		numero[0] = 3;
		numero[1] = 4;
		numero[2] = 5;
		numero[3] = 6;
		numero[4] = 7;

		for (int i = 0; i < numero.length; i++) {
			System.out.println("os elementos s�o: " + numero[i]);
		}
		System.out.println("o maior numero �: " + numero[4]);
		System.out.println("o menor numero �: " + numero[0]);
		System.out.println("a media �: " + (numero[0] + numero[2] + numero[3] + numero[4]) / 5);

	}

}
