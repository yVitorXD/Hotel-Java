package src.model;

public enum EnumTipo {

	// Constante, dentro dela um valor
	BASICO("B�sico"), MASTER("Master"), PRESIDENCIAL("Presidencial");
	
	private String valor;
	
	private EnumTipo(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
}
