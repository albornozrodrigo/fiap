import java.util.*;

public class Salario {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double salario, reauste = 18.0;

		System.out.printf("Informe o salario: ");
		salario = sc.nextDouble();

		salario = salario + (salario * reauste / 100);

		System.out.println("Salario com reauste de 18%: " + salario);
	}

}