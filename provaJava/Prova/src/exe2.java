import java.util.Scanner;

public class exe2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int vetor[] = new int [10];
		
		int i, total = 0 ;
		
		for(i=0 ; i<=9; i++){
			
			System.out.println("Insira a idade da pessoa");
			vetor[i] = leia.nextInt();
			
			if(vetor[i]>=18) {
				total++;
			}
			
			
			
		}
		
		System.out.println("número de pessoas com idade acima de 18 anos:"+total);
		
	}

}
