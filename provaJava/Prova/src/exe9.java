import java.util.Scanner;

public class exe9 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int valor ;
		
		System.out.println("Digite um n�mero entre 12 e 20");
		valor = leia.nextInt();
		
		if(valor<12 || valor>20) {
			System.out.println("entrada inv�lida");
		}else {
			System.out.println("entrada v�lida");
		}
	}

}
