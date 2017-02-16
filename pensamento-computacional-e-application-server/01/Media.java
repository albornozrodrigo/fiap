import java.util.Scanner;

public class Media {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.printf("Informe a primeira nota: ");
		nota1 = input.nextDouble();

		System.out.printf("Informe a segunda nota: ");
		nota2 = input.nextDouble();

		media = (nota1 + nota2) / 2;

		if(media >= 7.0) {
			System.out.println("Aluno aprovado!");
		}

		if(media >= 4.0 && media < 5.9) {
			System.out.println("Aluno de exame!");
		}

		if(media < 3.9) {
			System.out.println("Aluno reprovado!");
		}
	}

}