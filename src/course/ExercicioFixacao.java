package course;
import java.util.Scanner;

/* Fazer um programa para ler um número N (se for digitado um valor não 
 * positivo, mostrar mensagem e ler novamente). Em seguida, N valores
 * inteiros. Mostrar o maior dentre os N números digitados. Veja exemplo.
 */
public class ExercicioFixacao 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		int valor;
		int maior = Integer.MIN_VALUE;
		
		System.out.print("Enter N: ");
		n = sc.nextInt();
		
		while (n <=0)
		{
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Value #" + i +": ");
			valor = sc.nextInt();
		
				if(valor > maior)
					maior = valor;				
		}
		
		
		System.out.println("Higher: " + maior);
		sc.close();
	}

}
