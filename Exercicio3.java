import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args){
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o seu nome: ");			
			String nome = teclado.nextLine();
			System.out.println("Digite o seu sobrenome: ");			
			String sobrenome = teclado.nextLine();
			
			if (sobrenome == "Wayne") {
				System.out.println("Acesso liberado, Sr. Wayne”");
				
			} else {if (sobrenome == "Kent") {
				System.out.println("Saí daí, mané");
				
			} else {if (nome == "Diana") {
				System.out.println("Bem-vinda, Princesa de Themyscara");
			} else {
				System.out.println("Cai fora!");
						}	
					}
				}				
			}
		}	

