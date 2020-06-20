package entidades;

public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome,String endereco, String telefone, String cep, String cidade, String cnpj, String uf,String servico) {
		super(nome, telefone, uf, cep, cidade, endereco,servico);
		this.setCnpj(cnpj);
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() == 14)
			this.cnpj = cnpj;
		else
			this.cnpj = "inválido";
	}

	public String getCnpj() {
		return cnpj;
	}
}

