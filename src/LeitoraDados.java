import java.util.Scanner;

public final class LeitoraDados {

		
		private static Scanner scanner;
		
		static {
			scanner = new Scanner(System.in);
		}

		
		public static String lerDado() {
			
			String texto = scanner.nextLine();
			
			return texto;
		}
		
		public Integer lerDadoInt() {
			
			int inteiro = scanner.nextInt();
			
			return inteiro;
		}
		
		public  Double lerDadoDouble() {
			
			double valor = scanner.nextDouble();
			
			return valor;
		}
}
