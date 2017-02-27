import java.util.Scanner;

public class Combustivel {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double distancia, litros, consumo;

		System.out.printf("Informe a distancia percorrida (em km): ");
    	distancia = sc.nextDouble();

    	System.out.printf("Informe a quantidade de combustivel consumido (em litros): ");
    	litros = sc.nextDouble();

		consumo = distancia / litros;

		System.out.println("O comsumo médio do automóvel é de: " + consumo + " km/litro.");
	}

}