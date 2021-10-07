import java.util.Scanner;

public class exe3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		

		
		int vetor[] = new int [10];
		
		int i, total = 0, soma ;
		
		for(i=0 ; i<=9; i++){
			
			System.out.println("Insira o valor do produto");
			vetor[i] = leia.nextInt();
			
			total = total + vetor[i] ;
			
		}
		System.out.println("Valor total da Conta:"+ " "+ total);
	}

}
