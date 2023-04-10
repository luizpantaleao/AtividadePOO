import java.util.Scanner;
import java.lang.Math;

public class Exercicio1{
	public static void main(String[] args){
		
		System.out.println("CALCULADORA ");
		System.out.println("ADICAO - 1 ");
		System.out.println("SUBTRACAO - 2");
		System.out.println("MULTIPLICACAO - 3");
		System.out.println("DIVISAO - 4");
		System.out.println("POTENCIA - 5");
		System.out.println("RAIZ QUADRADA -6");
		System.out.println("RAIZ CUBICA - 7");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o código de uma das operações da calculadora: ");
		int num01 = teclado.nextInt();
		
		if (num01 == 1) {
			System.out.println("Digite o perimeiro numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			float num03 = teclado.nextInt();
			
			float num04 = num02 + num03;		
			System.out.println("Resultado: " + num04);
			
		}
		
		if (num01 == 2) {
			System.out.println("Digite o perimeiro numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			float num03 = teclado.nextInt();
			
			float num04 = num02 - num03;		
			System.out.println("Resultado: " + num04);
			
		}
		
		if (num01 == 3) {
			System.out.println("Digite o perimeiro numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			float num03 = teclado.nextInt();
			
			float num04 = num02 * num03;		
			System.out.println("Resultado: " + num04);
			
		}
		
		if (num01 == 4) {
			System.out.println("Digite o perimeiro numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			float num03 = teclado.nextInt();
			
			float num04 = num02 / num03;		
			System.out.println("Resultado: " + num04);
			
		}
		
		if (num01 == 5) {
			System.out.println("Digite o numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Digite a potencia: ");
			float num03 = teclado.nextInt();
			
			System.out.println("Resultado: " + Math.pow(num02, num03));
			
		}
		
		if (num01 == 6) {
			System.out.println("Digite o numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Resultado: " + Math.sqrt(num02));
			
		}
		
		if (num01 == 7) {
			System.out.println("Digite o numero: ");
			float num02 = teclado.nextInt();
			
			System.out.println("Resultado: " + Math.cbrt(num02));
			
		}
		}	

}