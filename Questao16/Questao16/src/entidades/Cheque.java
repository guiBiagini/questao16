package entidades;

public class Cheque extends ContaCorrente{
	public Cheque(int numero, double saldo, String titular, String cpf, double valor) {
		super(numero, saldo, titular, cpf);
		this.valor = valor;
	}

	private double valor;

	
	
	public void formataCheque() {
		System.out.println("Numero da Conta: " +this.getNumero());
		System.out.println("Titular: " +this.getTitular());
		System.out.println("CPF: " +this.getCpf());
		System.out.println("Valor R$: "+this.valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
