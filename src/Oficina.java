import java.util.ArrayList;
import java.util.Scanner;

import model.Carro;

public class Oficina {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		int Placa;
		String Reparo;
		float Valor;
		// declarar os itens de entrada marca mode etc
		ArrayList<Carro> lista = new ArrayList<Carro>();
		
		for(int i = 0, i < qtd; )
		Marca = teclado.nextLine();
		
		Carro c = new Carro(marca, modelo, placa, ano);

		do {
			System.out.println("Digite a opçao desejada:" + "\n" + "1 - Novo Concerto" + "\n" + "2 - Entrega do carro"
					+ "\n" + "3 - sair");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				do {
					System.out.println("Digite a Placa do veiculo ou Sair para retornonar ao menu anterior");
					Placa = teclado.nextInt();
					switch (Placa) {
					case 1345:
						System.out.println("Digite o tipo de concerto e o valor em reais");
						Reparo = teclado.nextLine();
						Valor = teclado.nextFloat();
						c1.TipoServico(Reparo, Valor);
						break;
					case 574:
						System.out.println("Digite o tipo de concerto e o valor em reais");
						Reparo = teclado.nextLine();
						Valor = teclado.nextFloat();
						c2.TipoServico(Reparo, Valor);
						break;
					case 8243:
						System.out.println("Digite o tipo de concerto e o valor em reais");
						Reparo = teclado.nextLine();
						Valor = teclado.nextFloat();
						c3.TipoServico(Reparo, Valor);
						break;
					case 0:
						System.out.println("Obrigado");
						break;
					default:
						System.out.println("Placa invalida");
					}
				} while (Placa != 0);
			}
		} while (opcao != 0);
	}
}
