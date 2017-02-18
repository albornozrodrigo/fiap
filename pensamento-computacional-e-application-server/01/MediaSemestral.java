import java.util.Scanner;

public class MediaSemestral {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double nac, am, ps, ms;

		System.out.printf("Informe a nota da NAC: ");
		nac = sc.nextDouble();

		System.out.printf("Informe a nota da AM: ");
		am = sc.nextDouble();

		System.out.printf("Informe a nota da PS: ");
		ps = sc.nextDouble();

		ms = (nac * 0.2 + am * 0.3 + ps * 0.5);

		System.out.println("A Media Semestral foi: " + ms);

		/*
		if(media >= 7.0) {
			System.out.println("Aluno aprovado!");
		}

		if(media >= 4.0 && media < 5.9) {
			System.out.println("Aluno de exame!");
		}

		if(media < 3.9) {
			System.out.println("Aluno reprovado!");
		}
		*/
	}

}