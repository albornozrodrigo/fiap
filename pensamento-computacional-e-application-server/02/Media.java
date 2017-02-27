import java.util.Scanner;

public class Media {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, media;
		String nome;

		System.out.printf("Informe seu nome: ");
		nome = sc.next();

		System.out.printf("Informe a nota da primeira prova: ");
		nota1 = sc.nextDouble();

		System.out.printf("Informe a nota da segunda prova: ");
		nota2 = sc.nextDouble();

		System.out.printf("Informe a nota da terceira prova: ");
		nota3 = sc.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("A média do aluno " + nome + " é: " + media);
	}

}