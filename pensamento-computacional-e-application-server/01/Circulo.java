import java.util.Scanner;
import java.text.DecimalFormat;

public class Circulo {

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);

        double pi = 3.14, raio, area, diametro, perimetro;

        System.out.printf("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();

		area = pi * raio * raio;
        perimetro = 2 * pi * raio; // circunferencia
        diametro = 2 * raio;

        System.out.println("Valor do diametro: " + diametro);
        System.out.println("Valor da area: " + area);
        System.out.println("Valor do perimetro: " + perimetro);
    }

}