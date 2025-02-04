package entities;

public class PessoaJuridica extends Contribuinte{
	
	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}	

	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		double sum = 0.0;
		if (funcionarios < 10) {
			sum = rendaAnual * 0.16;			
		}
		else {
			sum = rendaAnual * 0.14;
		}
		return sum;
	}

}
