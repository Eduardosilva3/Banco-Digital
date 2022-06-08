import java.util.Scanner;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void ContaCP() {
		//super.navegacao();
		
		Scanner scan = new Scanner(System.in);
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
			codigo = scan.nextInt();
			this.codigo = codigo;  
			this.operacao(this.codigo);
			
			if(codigo==5) continue;
			
			System.out.println("Deseja sair ou Realizar outra operação? ");
			System.out.println("1 - Realizar outra operação.");
			System.out.println("2 - Sair.");
			nav = scan.nextInt();
			if(nav == 1) {
				menu.menu(); }
			if(nav==2) break;
		}
	}
	
	protected void operacao(int retorn) {
		Scanner scan =  new Scanner(System.in);
		Cliente nome = new Cliente();
		
		ContaCorrente cc = new ContaCorrente(nome);
		
		
		ContaPoupanca cp = new ContaPoupanca(nome);
			
		int contaD = 0;
		double valor = 0;
		int extrato = 0;
	
			
		
		switch(retorn) {
		case 1: System.out.println("Digite o valor do saque: ");
		        valor = scan.nextDouble();
		        System.out.println("Valor a ser sacado: " + valor + "\n"+"  Processando Saque... ");
		         	if(valor>getSaldo()) {
		         		System.out.println("Saldo insuficiente. " + "\n" + "Cheque espcial não aprovado. Entre em contato com seu gerente.");
		         	}else {
		         		System.out.println("Saque aprovado ... ");
		         		this.sacar(valor);

		         	}
		        break;
		        
		
		case 2: System.out.println("Digite o valor do deposito: ");
				valor = scan.nextDouble();
				this.depositar(valor);
				System.out.println("Deposito realizado com sucesso, Valor depositado: " + valor);
				System.out.println("Saldo em conta R$:" + this.getSaldo());
				break;
			
		case 3: System.out.println("Digite o valor da transferencia: ");
				valor = scan.nextDouble();
				System.out.println("Selecione a conta Destino:");
				System.out.println(" 1 - conta corrente.");
				System.out.println(" 2 - conta poupança.");
				contaD = scan.nextInt();
				if(contaD == 1) {
					
					this.transferir(valor, cc);
					
				}else if (contaD == 2) {
					
					this.transferir(valor, cp);
					
				}
		case 4: System.out.println("Imprimindo Extrato ... ");
				
					cp.imprimirExtrato();
				
					
				
		}
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
