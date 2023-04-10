import java.util.Scanner;

public class Exercicio2{
	public static void main(String[] args){
		
		System.out.println("CONVERSOR DE TEMPERATURA ");
		System.out.println("CELCIUS - 1 ");
		System.out.println("FAHRENHEIT - 2");
		System.out.println("KELVIN - 3");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o código de uma das escalas: ");
		int num01 = teclado.nextInt();
		
		if (num01 == 1) {
			System.out.println("Insira a temperatura em celcius: ");
			double celcius = teclado.nextInt();
			
			double kelvin = celcius + 273;
			
			double fahrenheit = (celcius * 1.8) + 32;	
			
			System.out.println("Resultado" );
			System.out.println("Celcius: " + celcius);
			System.out.println("Fahrenheit: " + fahrenheit);
			System.out.println("Kelvin: " + kelvin);
			
		}
		
		if (num01 == 2) {
			System.out.println("Insira a temperatura em fahrenheit: ");
			double fahrenheit = teclado.nextInt();
			
			double celcius = (fahrenheit - 32) / 1.8;
			
			double kelvin = celcius + 273;	
			
			System.out.println("Resultado" );
			System.out.println("Celcius: " + celcius);
			System.out.println("Fahrenheit: " + fahrenheit);
			System.out.println("Kelvin: " + kelvin);
			
		}
		
		if (num01 == 3) {
			System.out.println("Insira a temperatura em kelvin: ");
			double kelvin = teclado.nextInt();
			
			double celcius = kelvin - 273;
			
			double fahrenheit = (celcius * 1.8) + 32;	
			
			System.out.println("Resultado" );
			System.out.println("Celcius: " + celcius);
			System.out.println("Fahrenheit: " + fahrenheit);
			System.out.println("Kelvin: " + kelvin);
			
		}
		
		}	

}