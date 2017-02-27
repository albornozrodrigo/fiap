import java.util.Scanner;

public class Troca {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String a, b, c;

		System.out.printf("Informe o valor da variavel A: ");
		a = sc.next();

		System.out.printf("Informe o valor da variavel B: ");
		b = sc.next();

		c = b;
		b = a;
		a = c;

		System.out.println("Valor da variavel A: " + a);
		System.out.println("Valor da variavel B " + b);
	}

}