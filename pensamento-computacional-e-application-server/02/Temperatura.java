import java.util.Scanner;

public class Temperatura {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double f, c;

		System.out.printf("Informe a temperatura em graus celsius: ");
		c = sc.nextDouble();

		f = (9 * c + 160) / 5;

		System.out.println("A temperatura em Farenheit é: " + f);
	}

}