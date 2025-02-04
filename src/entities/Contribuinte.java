package entities;

public abstract class Contribuinte {
	
	private String nome;
	protected Double rendaAnual;
	
	public Contribuinte() {		
	}

	public Contribuinte(String name, Double rendaAnual) {
		super();
		this.nome = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double imposto();
}