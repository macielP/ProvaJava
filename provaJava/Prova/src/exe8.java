import java.util.Scanner;

public class exe8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		int vetor[] = new int [11];
        int i, calc, total ;
        
        System.out.println("Insira um valor");
        calc = leia.nextInt();
		
		for(i=0 ; i<=10; i++){
			
			
			vetor[i] = calc*i;
			
			System.out.println(vetor[i]);
			
			
		}
	}

}
