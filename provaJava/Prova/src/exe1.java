import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int i, id, ida, idad, idade, soma ;
		
		System.out.println("Insira a Idade da primeira pessoa");
		i = leia.nextInt();
		
		System.out.println("Insira a Idade da segunda pessoa");
		id = leia.nextInt();
		
		System.out.println("Insira a Idade da terceira pessoa");
		ida = leia.nextInt();
		
		System.out.println("Insira a Idade da quarta pessoa");
		idad = leia.nextInt();
		
		System.out.println("Insira a Idade da quinta pessoa");
		idade = leia.nextInt();
		
		soma = i + id + ida + idad + idade ;

		System.out.println("Idade de cada um:");
		System.out.println("");
		
		System.out.println(i);
		System.out.println(id);
		System.out.println(ida);
		System.out.println(idad);
		System.out.println(idade);
		
		System.out.println("Soma das idades:");
		System.out.println("");
		System.out.println(soma);
		
		
		
	}

}
