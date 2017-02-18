import java.util.*;

public class Iptu {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double iptu, desconto = 4.0;
		int tipo, parcelas;

		System.out.printf("Informe o valor do IPTU: ");
		iptu = sc.nextDouble();

		System.out.printf("Para pagamento a vista com 4%% de desconto => Digite 1\nPara pagamento em 10 vezes => Digite 2\nPagamento: ");
		tipo = sc.nextInt();

		if(tipo == 1) {
			iptu = iptu - (iptu * desconto / 100);
			System.out.println("Valor para pagamento a vista com desconto de 4%: R$" + iptu);
		} else {
			System.out.printf("Informe a quantidade de parcelas: ");
			parcelas = sc.nextInt();
			iptu = iptu / parcelas;
			System.out.println("Valor para pagamento em " + parcelas + " vezes: R$" + iptu);
		}
	}

}