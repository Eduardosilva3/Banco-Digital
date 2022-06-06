import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cliente nome = new Cliente();
		ContaCorrente cc = new ContaCorrente(null);
		Banco banco = new Banco();
		operacao codigo = new operacao();
		System.out.println("Digite o nome do Banco: ");
		banco.setNome(scan.nextLine());
		int nav = 0;
		while(codigo.getCodigo()!=5) {
			System.out.println("\n"+ "\n" + "Seja bem vindo ao "+banco.getNome()+" "+ "Selecione a opção desejada: ");
			System.out.println("1 - Saque ");
			System.out.println("2 - Depositar ");
			System.out.println("3 - Trasnferir ");
			System.out.println("4 - Imprimir extrato");
			System.out.println("5 - Sair ");
			System.out.println("  ");
			codigo.setCodigo(scan.nextInt());
			codigo.navegacao(0);  
			
			if(codigo.getCodigo()==5) continue;
			
			System.out.println("Deseja sair ou Realizar outra operação? ");
			System.out.println("1 - Realizar outra operação.");
			System.out.println("2 - Sair.");
			nav = scan.nextInt();
			if(nav==2) break;
		}

		System.out.println("Sistema Finalizado. " + "\n" + banco.getNome()+ " Agradece a preferência. ");
		
	}

}
