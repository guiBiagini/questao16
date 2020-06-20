package entidades;

import excessoes.ContaException;

public class ContaCorrente extends Conta {
	private double valorDoCheque;

	public ContaCorrente(int numero, double saldo, String titular, String cpf) {
		super(numero, saldo, titular, cpf);
	}

	public void emitirCheque(double valorDoCheque) {
		@SuppressWarnings("unused")
		Cheque cheque = new Cheque(this.getNumero(), this.saldo, this.getTitular(), this.getCpf(), valorDoCheque);

	}

	public void emitirTalao(double valorDoCheque) {
		@SuppressWarnings("unused")
		talaoDeCheque talao = new talaoDeCheque(this.getNumero(), this.saldo, this.getTitular(), this.getCpf(),
				valorDoCheque);
	}

	@Override
	public void sacar(double quantia) {
		if (valorDoCheque < Math.abs(this.saldo - quantia)) {
			throw new ContaException("Saldo Insuficiente!");
		}
		if (quantia <= 0)
			throw new ContaException("A quantia não pode ser 0 ou negativa");
		this.saldo -= quantia;
	}

	public double getValorDoCheque() {
		return valorDoCheque;
	}

	public void setValorDoCheque(double valorDoCheque) {
		this.valorDoCheque = valorDoCheque;
	}

}
