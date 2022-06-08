import java.util.Scanner;

public class MenuContas {
	
	//protected Cliente cliente;
	public static String nomeC;
	
	
	
	

	public String nome() {
		Scanner scan = new Scanner(System.in);
		String nome = " ";
		System.out.println("Digite o nome do Cliente: ");
		nome = scan.nextLine();
		MenuContas.nomeC = nome;
		return nomeC;
	}
	
	
	
	public void menu() {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		Cliente nome = new Cliente();
		String nomeC = MenuContas.nomeC;
		nome.setNome(nomeC);
	
		
		ContaCorrente cc = new ContaCorrente(nome);
		ContaPoupanca cp =  new ContaPoupanca(nome);
		
		int nav = 0;
		
		System.out.println("Cliente: " + nome.getNome());
		System.out.println("  ");
		System.out.println("Qual conta deseja acessar?.");
		System.out.println("1 - Conta Corrente.");
		System.out.println("2 - Conta poupança.");
		
		nav = scan.nextInt();
		
		if(nav==1) {
			cc.ContaCC();
		}else if (nav==2) {
			cp.ContaCP();
		}
	}

}
