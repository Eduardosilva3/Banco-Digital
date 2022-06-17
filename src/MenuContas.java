

public class MenuContas {
	
	//protected Cliente cliente;
	public static String nomeC;
	
	
	
	

	public String nome() {
		
		String nome = " ";
		System.out.println("Digite o nome do Cliente: ");
		
		nome = LeitoraDados.lerDado();
		MenuContas.nomeC = nome;
		
		return nomeC;
	}
	
	
	
	public void menu() {
		
		
		
		
		
		LeitoraDados scan = new LeitoraDados();
		Cliente nome = new Cliente();
		String nomeC = MenuContas.nomeC;
		nome.setNome(nomeC);
	
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp =  new ContaPoupanca();
		
		int nav = 0;
		
		System.out.println("Cliente: " + nome.getNome());
		System.out.println("  ");
		System.out.println("Qual conta deseja acessar?.");
		System.out.println("1 - Conta Corrente.");
		System.out.println("2 - Conta poupança.");
		
		nav = scan.lerDadoInt();
		
		if(nav==1) {
			cc.ContaCC();
		}else if (nav == 2) {
			cp.ContaCP();
		}
	}
	
	

}
