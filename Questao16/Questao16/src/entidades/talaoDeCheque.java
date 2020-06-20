package entidades;

public class talaoDeCheque extends Cheque  {
	static final int numMaxCheques = 20;
	private Cheque TabCheque[];

	public talaoDeCheque(int numero, double saldo, String titular, String cpf, double valor) {
		super(numero, saldo, titular, cpf, valor);
		for (int i = 0; i <numMaxCheques; i++) {
			Cheque c = new Cheque (numero,saldo,titular,cpf,valor);
			TabCheque[i] = c;
		}
		
		
	}

	
}
