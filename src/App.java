import java.util.ArrayList;import java.util.Comparator;

import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumTipo;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepcionista;

public class App {
	public static void main(String[] args) {
		System.out.println("Hotel Java");
		System.out.println();
	
		//Recepcionista recepcionista1 = new Recepcionista("Valeria", "129301202", "32890328");
		
		//recepcionista1.atenderOTelefone();
		//recepcionista1.falarIngles();
		
		//Camareira camareira1 = new Camareira("Joana", "32329032", "283902382");
		
		//camareira1.arrumarACama();
		//camareira1.limparQuarto();
		
		
		// Deu uma dor de barriga na Valeria, ela nao vai poder trabalhar hoje;
	//	Gerente gerente1 = new Gerente("Fabricio", "32323232", "43423432");
		
		//gerente1.atenderOTelefone();
		//gerente1.falarIngles();
		//gerente1.arrumarACama();
		//gerente1.limparQuarto();
		
	//	Quarto quarto1 = new Quarto();
	//	quarto1.setNumero("206A");
		//quarto1.setValor(100.0);
		//quarto1.setTipo(EnumTipo.BASICO);
		
		//Quarto quarto2 = new Quarto();
		//quarto1.setNumero("306A");
		//quarto1.setValor(200.0);
		//quarto1.setTipo(EnumTipo.PRESIDENCIAL);
		
		//System.out.println(quarto1.getTipo());
		//System.out.println(quarto1.getTipo().getValor());
		
		
		Cliente cliente1 = new Cliente("Manoel da Silva", "323232302", "3323423423432", 42);
		Cliente cliente2 = new Cliente("Fulano de tal", "434332302", "4423423423432", 21);
		Cliente cliente3 = new Cliente("BCiclano Rodrigues", "5656532302", "55423423432", 36);
		Cliente cliente4 = new Cliente("Beltrano Rodrigues", "76723232302", "6723423423432", 56);
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		
		
		// Retorna a quantidade de elementos presentes em uma Stream(coleçao)
		// Com stream
		clientes.stream().count();
		
		// Sem stream
		clientes.size();
		// Ambos retornam 4
		
		// vai retornar uma nova lista com apenas 2 elementos da lista atual posicao 0 e 1.
		
		
		clientes.stream()
		.limit(2)
		.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		clientes.stream()
		.skip(2)
		.forEach(c -> System.out.println(c.getNome()));
		
		
		
		// pula os 2 primeiros e retorna o resto
		
		
		// retornar lista ordenada
		//var resultado3 = clientes.stream().sorted();
		
		// clientes.stream().sorted(comparing(Cliente::getIdade));
		System.out.println();
		// filtro dentro da stream com lambda
		
		// Filtrando idade maior que 25 e retornando nomes
		clientes.stream()
		.filter(c -> c.getIdade() > 25)
		.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println();
		
		
		// Filtrei o nome, e busquei todos com o nome "rodrigues", depois printei o nome dos filtrados.
		clientes.stream()
		.filter(c -> c.getNome().contains("rodrigues"))
		.forEach(c -> System.out.println(c.getNome()));
		
		
		// Retornando "retorna o que começa/inicia com "B"
		clientes.stream()
		.filter(c -> c.getNome().startsWith("B"))
		.forEach(c -> System.out.println(c.getNome()));
		
	}
}
