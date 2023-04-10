import java.util.Scanner;
import java.lang.Math;

public class Exercicio4{
	public static void main(String[] args){		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num01 = teclado.nextInt();
		int num02 = num01 % 2;
		
		
		if (num02 == 0) {
			
			System.out.println("Resultado: " + Math.sqrt(num01));
			
		} else {
			
			System.out.println("Resultado: " + Math.cbrt(num01));
			
		}
		}	

}