import java.util.Scanner;

public class Media {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.printf("Informe a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.printf("Informe a segunda nota: ");
		nota2 = sc.nextDouble();

		media = (nota1 + nota2) / 2;

		System.out.println("A média é: " + media);
	}

}