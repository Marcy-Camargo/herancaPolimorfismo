package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Dados do " + i + "ª contribuinte: ");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char tipo = sc.next().charAt(0);			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if(tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int funcionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}		
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		//FOR PRA LER O NOME E TOTAL DE IMPOSTOS PAGOS POR CONTRIBUINTE
		for(Contribuinte contribuinte : list) {			
			System.out.println(contribuinte.getName() + ": $ " + String.format("%.2f", contribuinte.imposto()));
		}
		
		
		System.out.println();
		double sum = 0.0;
		//FOR PRA IMPRIMIR O TOTAL DE IMPOSTOS PAGOS POR TODOS OS CONTRIBUINTES
		for(Contribuinte contribuinte : list) {
			double imposto = contribuinte.imposto();
			sum += imposto;
		}
		System.out.println("TOTAL DE IMPOSTO PAGO: $" + String.format("%.2f", sum));		
		
		sc.close();
	}
}