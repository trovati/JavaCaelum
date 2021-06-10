package alura;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		
		minhaConta.numero = 15;
		
		minhaConta.saldo = 100.0;
		
		minhaConta.titular = "Watson";
		
		System.out.println("========= Dados da Conta =====================");
		
		System.out.println("Titular:" + minhaConta.titular);
		
		System.out.println("Número: "+ minhaConta.numero);
		
		System.out.println("Saldo: R$"+ minhaConta.saldo);
		
		minhaConta.depositar(10.0);
		
		System.out.println("============================");
		
		System.out.println("Saldo:R$" + minhaConta.saldo);
		
		System.out.println("FIM========================");
		
		Conta minhaContaFabio = new Conta();
		
		minhaContaFabio.numero = 15;
		
		minhaContaFabio.saldo = 100.0;
		
		minhaContaFabio.titular = "Fabio";
		
		System.out.println("===== Dados da Conta ==============");
		System.out.println("Titular: " + minhaContaFabio.titular);
		System.out.println("Número: " + minhaContaFabio.numero);
		System.out.println("Saldo: R$" + minhaContaFabio.saldo);
		
		minhaContaFabio.depositar(200);
		
		System.out.println("===================================");
		
	}

}
