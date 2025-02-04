package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		//EXPRESSÃO CONDICIONAL TERNÁRIA: double valorImposto = (getRendaAnual() < 20000.00) ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25;
		double sum = 0.0;
		if (getRendaAnual() < 20000.00) {
			sum = (getRendaAnual() * 0.15) - (getGastosSaude() * 0.50);			
		}
		else {
			sum = (getRendaAnual() * 0.25) - (getGastosSaude() * 0.50);
		}
		return sum;
	}

}
