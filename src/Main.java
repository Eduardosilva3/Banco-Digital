import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Cliente nome = new Cliente();
		
		MenuContas menu = new MenuContas();
	
		Banco banco = new Banco();
		
		System.out.println("Digite o nome do Banco: ");
		banco.setNome(scan.nextLine());
		
		
		System.out.println("\n"+ "\n" + "Seja bem vindo ao "+ banco.getNome() +" ");
		System.out.println("");
		menu.nome();
		menu.menu();

		System.out.println("Sistema Finalizado. " + "\n" + banco.getNome()+ " Agradece a preferência. ");
		scan.close();
	}

}
