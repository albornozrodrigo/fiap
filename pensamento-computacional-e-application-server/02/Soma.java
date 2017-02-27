import java.util.Scanner;

public class Soma {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n1, n2;

		System.out.printf("Informe o primeiro numero: ");
		n1 = sc.nextInt();

		System.out.printf("Informe o segundo numero: ");
		n2 = sc.nextInt();

		System.out.println("Resultado da soma: " + (n1 + n2));
	}

}