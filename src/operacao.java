import java.util.Scanner;

public class operacao {
	protected int codigo;
	protected double saque;
	public String retorno;
	protected double retornoValor;
	
	
	Conta cc = new ContaCorrente(null);
	Conta poupanca = new ContaPoupanca(null);
	
	


	public double getRetornoValor() {
		return retornoValor;
	}

	public void setRetornoValor(double retornoValor) {
		this.retornoValor = retornoValor;
	}

	public  String getSaque() {
		String saT = "saque";
		return saT;
	}

	

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public void navegacao(int retorn) {
		Scanner scan =  new Scanner(System.in);
		retorn = this.codigo;
		
	
			
		
		switch(retorn) {
		case 1: System.out.println("Digite o valor do saque: ");
		        setRetornoValor(scan.nextDouble());
		        System.out.println("Valor a ser sacado: " + getRetornoValor() + "\n"+"  Processando Saque... ");
		         	if(getRetornoValor()>cc.getSaldo()) {
		         		System.out.println("Saldo insuficiente. " + "\n" + "Cheque espcial não aprovado. Entre em contato com seu gerente.");
		         	}else {
		         		System.out.println("Saque aprovado ... ");
		         		cc.sacar(getRetornoValor());

		         	}
		        break;
		        
		
		case 2: System.out.println("Digite o valor do deposito: ");
				setRetornoValor(scan.nextDouble());
				cc.depositar(getRetornoValor());
				System.out.println("Deposito realizado com sucesso, Valor depositado: " + getRetornoValor());
				System.out.println("Saldo em conta corrente R$:" + cc.getSaldo());
				break;
			
		case 3: System.out.println("Digite o valor da transferencia: ");
		case 4: System.out.println("Imprimindo Extrato ... ");
				
			
		}
		
	}
	

		
		
		
	

	
	

	
	
	
	

	

}
