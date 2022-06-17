import java.util.Scanner;

public final class LeitoraDados {

		
		private static Scanner scanner;
		
		static {
			scanner = new Scanner(System.in);
		}

		
		public static String lerDado() {
			
			String texto = scanner.nextLine();
			//testando git
			return texto;
		}
}
