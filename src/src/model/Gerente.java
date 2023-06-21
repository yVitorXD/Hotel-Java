package src.model;

import src.interfaces.ICamareira;
import src.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista{

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
		
	}

	@Override
	public void atenderOTelefone() {
		System.out.println("Sei atender mais ou mnenos o telefone");
		System.out.println();
		
	}

	@Override
	public void falarIngles() {
		System.out.println("Sei muito bem falar ingles");
		System.out.println();
	}

	@Override
	public void arrumarACama() {
		System.out.println("Sei muito bem arruma a cama");
		System.out.println();
		
	}

	@Override
	public void limparQuarto() {
		System.out.println("Sei limpar o quarto mais ou menos");
		System.out.println();
	}

	
}
