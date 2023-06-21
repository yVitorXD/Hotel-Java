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
		
		Cliente cliente1 = new Cliente("Manoel da Silva", "323232302", "23423423432");
		
		Recepcionista recepcionista1 = new Recepcionista("Valeria", "129301202", "32890328");
		
		recepcionista1.atenderOTelefone();
		recepcionista1.falarIngles();
		
		Camareira camareira1 = new Camareira("Joana", "32329032", "283902382");
		
		camareira1.arrumarACama();
		camareira1.limparQuarto();
		
		
		// Deu uma dor de barriga na Valeria, ela nao vai poder trabalhar hoje;
		Gerente gerente1 = new Gerente("Fabricio", "32323232", "43423432");
		
		gerente1.atenderOTelefone();
		gerente1.falarIngles();
		gerente1.arrumarACama();
		gerente1.limparQuarto();
		
		Quarto quarto1 = new Quarto();
		quarto1.setNumero("206A");
		quarto1.setValor(100.0);
		quarto1.setTipo(EnumTipo.BASICO);
		
		Quarto quarto2 = new Quarto();
		quarto1.setNumero("306A");
		quarto1.setValor(200.0);
		quarto1.setTipo(EnumTipo.PRESIDENCIAL);
		
		System.out.println(quarto1.getTipo());
		System.out.println(quarto1.getTipo().getValor());
		
		
		
		
	}
}
