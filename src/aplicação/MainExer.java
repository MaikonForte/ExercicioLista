package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class MainExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Quantos funcionarios serão registrados: ");

		List<Funcionario> lista = new ArrayList<>();

		Integer n = input.nextInt();
		

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ":");

			System.out.print("id: ");
			input.nextLine();
			int id = input.nextInt();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			
			input.nextLine();
			System.out.print("Salario: ");
			double salario = input.nextDouble();
			lista.add(new Funcionario (id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Entre com o Id do funcionario que tera aumento: ");
		int id = input.nextInt();

		Funcionario fun = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (fun == null) {
			System.out.println("Id de funcinario não existe!!");
		} 
		
		else {
			System.out.print("Porcentagem de aumento: ");
			Double aum = input.nextDouble();
			fun.aumSal(aum);
		}
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		
		for (Funcionario obj : lista) {
			System.out.println(obj);
		}

	}

}
