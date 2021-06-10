package alura;

public class Conta {


		int numero;
		
		double saldo;
		
		String titular;
		
		void depositar(double valor) {
			
			this.saldo = this.saldo + valor;

	}
		boolean sacar(double valor) {
			if(this.saldo < valor) {
				return false;
			} else {
				this.saldo = (this.saldo - valor) - 0.1;
				return true;
			}
		}

		
		boolean transfere(Conta contaDestino, double valor) {
			
			if(this.sacar(valor)) {
				contaDestino.depositar(valor);
				
				return true;
			} else {
				return false;
			}
			
		}
		
}

class Cliente {
	String cpf;
	
	String nome;
}
