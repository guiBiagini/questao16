package entidades;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica(String nome, String telefone, String uf, String cep, String cidade,String sexo, int idade, String cpf, String endereco,String servico) {
		super(nome, telefone, uf, cep, cidade, endereco, servico);
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() == 11)
			this.cpf = cpf;
		else
			this.cpf = "Inválido";
	}
}
