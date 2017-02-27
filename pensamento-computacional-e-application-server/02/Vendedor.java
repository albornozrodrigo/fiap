import java.util.*;

public class Vendedor {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario, vendas, total, comissao = 15.0;

		System.out.printf("Informe o nome do vendedor: ");
		nome = sc.next();

		System.out.printf("Informe o salario: ");
		salario = sc.nextDouble();

		System.out.printf("Informe o valor das vendas: ");
		vendas = sc.nextDouble();

		total = salario + (vendas * comissao / 100);

		System.out.println("O vendedor " + nome + " ganha o valor fixo de " + salario + " e receberá " + total + " no final do mês");
	}

}