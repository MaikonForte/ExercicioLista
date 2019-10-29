package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> lista = new ArrayList<>();
		
		
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("Maikon");
		lista.add("Carlos");
		lista.add("Antonio");
		lista.add("José");
		lista.add(3, "Alberto");
		
		System.out.println(lista.size());
		
		//exemplos de comandos para remover objetos da lista:
		
		//lista.remove("Maria"); // pode usar por posição exemplo lista.remove(1);
		
		lista.removeIf(x -> x.charAt(0) == 'A'); // Remoçao por predicado, remove palavras com a inicial definada entre aspas simples
		
		System.out.println("----------------------------");
		
		//criar uma lista coma apenas pessoas que tenham a mesma incial:
		
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for(String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		
		//para encontrar o primeiro objeto da lista com um inicia especifica, usar:
		
		String nome = lista.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(nome);
		
		
	System.out.println("-----------------------");
		//para encontrar a posição de um elemento:
		
		System.out.println("Maikon esta na posição " + lista.indexOf("Maikon"));
		
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		System.out.println("-----------------------");
		
		List<Integer> lista2 = new ArrayList<>();
		
		lista2.add(0);
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		lista2.add(2, 100);
		
		for (Integer y : lista2) {
			System.out.println(y);
			}
		
		lista2.removeIf(y -> y.intValue() == 1);
		
		
		
		

	}
	
	

}
