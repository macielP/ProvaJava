import java.util.Scanner;
import java.util.Arrays;

public class exe10 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		int i, total = 0, soma, pessoas, maiorIdade = 0, menorIdade  = 0, mulheres = 0, j = 0;
		
		double media=0, menorSalario=0 ;
		
		System.out.println("Insira a quantidade de pessoas:");
		pessoas = leia.nextInt();
		
		String sexo[] = new String [pessoas];
		
		
		int idade[] = new int [pessoas];
		
		
		double salario[] = new double [pessoas];
		
		for(i=0 ; i<pessoas; i++){
			
			System.out.println("Insira o sexo");
			sexo[i] = leia.next();
			System.out.println("Insira a idade");
			idade[i] = leia.nextInt();
			System.out.println("Insira o salário");
			salario[i] = leia.nextDouble();
			
			media = media + salario[i] ;
			
			if(maiorIdade == 0) {
				maiorIdade = idade[i] ;
			}
			
			if(menorIdade == 0) {
				menorIdade = idade[i] ;
			}
			
			if(maiorIdade < idade[i] ) {
				maiorIdade = idade[i] ;
			}
			
			if(menorIdade > idade[i] ) {
				menorIdade = idade[i] ;
			}
			
			
			if(sexo[i].equals("f")) {
				mulheres++;
			}
			
			
			
			
			
			if(menorSalario == 0) {
				menorSalario = salario[i] ;
			}
			
			
			if(menorSalario > salario[i] ) {
				j = i ;
			}
			
			
		}
		
		media = media / pessoas ;
		
		System.out.println("Média:"+ media);
		
		System.out.println("Maior Idade:"+maiorIdade);
		
		System.out.println("Menor Idade:"+menorIdade);
		
		System.out.println("Número de Mulheres:"+mulheres);
		
		System.out.println("A idade da pessoa que tem o menor salário é:"+idade[j]);
		System.out.println("O sexo da pessoa que tem o menor salário:"+sexo[j]);
		
		
		
		
		
		

        
        
		
	}

}
