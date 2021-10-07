import java.util.Scanner;

public class exe9 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int valor ;
		
		System.out.println("Digite um número entre 12 e 20");
		valor = leia.nextInt();
		
		if(valor<12 || valor>20) {
			System.out.println("entrada inválida");
		}else {
			System.out.println("entrada válida");
		}
	}

}
