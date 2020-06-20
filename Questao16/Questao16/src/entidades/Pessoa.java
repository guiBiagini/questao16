package entidades;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cep;
	private String cidade;
	private String uf;
	private String servico;
	
	public Pessoa(String nome, String endereco, String telefone, String cep, String cidade, String uf, String servico) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.servico = servico;
	}
	
	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
