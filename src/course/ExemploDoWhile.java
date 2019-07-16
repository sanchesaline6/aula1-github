package course;
import java.util.Locale;
import java.util.Scanner;

/*Digitar um número e mostrar sua raiz quadrada, depois perguntar ao
 * usuário se ele deseja repetir o procedimento (y/n). Caso ele responda
 * 'y', repetir o procedimento.
 */

public class ExemploDoWhile 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		char repeat;
		double root;
			
		do
		{
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			
			root = Math.sqrt(number);
			
			System.out.printf("Square root = %.3f\n" , root);
			System.out.print("Repeat (y/n)? ");
			repeat = sc.next().charAt(0);
		}while(repeat == 'y');
		
		sc.close();

	}

}
