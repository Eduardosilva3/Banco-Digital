

public class ContaPoupanca implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected static double saldo;
	protected static String cliente;
	private int codigo;

	public void Conta() {
		this.agencia = ContaPoupanca.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	public void ContaCP() {
		
		
		LeitoraDados scan = new LeitoraDados();
		MenuContas menu = new MenuContas();
		int codigo = 0;
		int nav = 0;
		
		while(codigo!=5) {
			System.out.println("Selecione a operação desejada: ");
			System.out.println("1 - Saque ");
			System.out.println("2 - Depositar ");
			System.out.println("3 - Trasnferir ");
			System.out.println("4 - Imprimir extrato");
			System.out.println("5 - Sair ");
			System.out.println("  ");
			codigo = scan.lerDadoInt();
			this.codigo = codigo;  
			this.operacao(this.codigo);
			
			if(codigo==5) continue;
			
			System.out.println("Deseja sair ou Realizar outra operação? ");
			System.out.println("1 - Realizar outra operação.");
			System.out.println("2 - Sair.");
			nav = scan.lerDadoInt();
			if(nav == 1) {
				menu.menu(); }
			if(nav==2) break;
		}
		
	}
	
	protected void operacao(int retorn) {
		
		LeitoraDados scan = new LeitoraDados();
		
		ContaCorrente cc = new ContaCorrente();
		
		
		ContaPoupanca cp = new ContaPoupanca();
			
		int contaD = 0;
		double valor = 0;
	
	
			
		
		switch(retorn) {
		case 1: System.out.println("Digite o valor do saque: ");
		        valor = scan.lerDadoDouble();
		        System.out.println("Valor a ser sacado: " + valor + "\n"+"  Processando Saque... ");
		         	if(valor>getSaldo()) {
		         		System.out.println("Saldo insuficiente. " + "\n" + "Cheque espcial não aprovado. Entre em contato com seu gerente.");
		         	}else {
		         		System.out.println("Saque aprovado ... ");
		         		this.sacar(valor);

		         	}
		        break;
		        
		
		case 2: System.out.println("Digite o valor do deposito: ");
				valor = scan.lerDadoDouble();
				this.depositar(valor);
				System.out.println("Deposito realizado com sucesso, Valor depositado: " + valor);
				System.out.println("Saldo em conta R$:" + this.getSaldo());
				break;
			
		case 3: System.out.println("Digite o valor da transferencia: ");
				valor =  scan.lerDadoDouble();
		
				if(valor>getSaldo()) {
     				System.out.println("Saldo insuficiente. " + "\n" + "Cheque espcial não aprovado. Entre em contato com seu gerente.");
				}else {
					System.out.println("Selecione a conta Destino:");
					System.out.println(" 1 - conta corrente.");
					System.out.println(" 2 - conta poupança.");
			
					contaD = scan.lerDadoInt();
					if(contaD == 1) {
				
						this.transferir(valor, cc);
				
					}else if (contaD == 2) {
				
						this.transferir(valor, cp);
				
					}
					System.out.println("Transferencia Realizada com sucesso.");
				}
				break;
		case 4: System.out.println("Imprimindo Extrato ... ");
				
					cp.imprimirExtrato();
				
					
				
		}
		
	}
	

	@Override
	public void imprimirExtrato() {
		Cliente nome = new Cliente();
		System.out.println("=== Extrato Conta Poupança ===");
		System.out.println(String.format("Titular: %s", nome.getNome()));
		System.out.println(String.format("Agencia: %d", ContaPoupanca.AGENCIA_PADRAO));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", ContaPoupanca.saldo));
	}
}
