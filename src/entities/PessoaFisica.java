package entities;

public final class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
		// TODO Auto-generated constructor stub
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculoImposto() {
		if (rendaAnual > 20000.00) {
			if (gastosSaude > 0) {
				return ((rendaAnual * 25) - (gastosSaude * 50)) / 100;
			} else {
				return (rendaAnual * 25) / 100;
			}
		} else {
			if (gastosSaude > 0) {
				return ((rendaAnual * 15) - (gastosSaude * 50)) / 100;
			} else {
				return (rendaAnual * 15) / 100;
			}

		}
	}

}
