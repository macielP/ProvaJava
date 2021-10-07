import java.util.Scanner;

public class exe6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int nota1, nota2, nota3, total ;
		
		System.out.println("Insira a nota 1");
		nota1 = leia.nextInt();
		
		System.out.println("Insira a nota 2");
		nota2 = leia.nextInt();
		
		System.out.println("Insira a nota 3");
		nota3 = leia.nextInt();
		
		total = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Média:"+ total);
		
	}

}
