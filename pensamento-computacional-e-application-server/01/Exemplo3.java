import java.util.*;

public class Exemplo3 {

	public static void main(String args[]) {
		int nr1, nr2, nr3, nr4, nr5, output = 0;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.printf("Digite o primeiro número: ");
		nr1 = sc.nextInt();
		
		System.out.printf("Digite o segundo número: ");
		nr2 = sc.nextInt();
		
		System.out.printf("Digite o terceiro número: ");
		nr3 = sc.nextInt();
		
		System.out.printf("Digite o quarto número: ");
		nr4 = sc.nextInt();
		
		System.out.printf("Digite o quinto número: ");
		nr5 = sc.nextInt();
		
		output = (nr1 + nr2 + nr3 + nr4 + nr5);
		*/

		for(int x = 1; x < 6; x++) {
			System.out.printf("Digite o número da posição " + x + ": ");
			output = (output + sc.nextInt());
		}
		
		System.out.println("O resultado da soma é: " + output);
	}

}