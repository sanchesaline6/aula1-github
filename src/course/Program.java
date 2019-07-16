package course;

//import java.util.Locale;
//import java.util.Scanner;

public class Program 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2); //operador bitwise AND
		System.out.println(n1 | n2); //operador bitwise OR
		System.out.println(n1 ^n2); //operador bitwise XOR
		
		/*Fazer um programa para executar o seguinte procedimento de entrada de dados, e depois mostrar os dados na tela:
		 * 
		 * Enter your full name:
		 * Alex Green
		 * How many bedrooms are there in your house?
		 * 3
		 * Enter product price:
		 * 500.50
		 * Enter your last name, age and height (same line):
		 * Green 21 1.73
		 */
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * String fullName; int bedrooms; double price; String sentence; String
		 * lastName; int age; double height;
		 * 
		 * System.out.println("Enter your full name:"); fullName = sc.nextLine();
		 * System.out.println("How many bedrooms are there in your house?"); bedrooms =
		 * sc.nextInt(); System.out.println("Enter product price: "); price =
		 * sc.nextDouble();
		 * System.out.println("Enter your last name, age and height (same line): ");
		 * lastName = sc.next(); age = sc.nextInt(); height = sc.nextDouble();
		 * 
		 * System.out.println(fullName); System.out.println(bedrooms);
		 * System.out.println(price); System.out.println(lastName);
		 * System.out.println(age); System.out.println(height);
		 * 
		 * 
		 * sc.close();
		 */
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * int n1 = sc.nextInt(); sc.nextLine(); //limpeza de stream de entrada (flush)
		 * String name = sc.nextLine(); char gender = sc.next().charAt(0); //b5 String s
		 * = sc.next(); char letter = s.charAt(0); int digit =
		 * Integer.parseInt(s.substring(1)); //4.32 double n2 = sc.nextDouble(); //
		 * Maria F 23 1.68 String name2 = sc.next(); char ch = sc.next().charAt(0); int
		 * age = sc.nextInt(); double height = sc.nextDouble();
		 * 
		 * System.out.println(n1); System.out.println(name); System.out.println(gender);
		 * System.out.println(letter); System.out.println(digit);
		 * System.out.println(n2); System.out.println(name2); System.out.println(ch);
		 * System.out.println(age); System.out.println(height);
		 * 
		 * sc.close();
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String sentence = sc.nextLine(); String x, y, z; x = sc.next(); y =
		 * sc.next(); z = sc.next();
		 * 
		 * System.out.println(sentence); System.out.println(x); System.out.println(y);
		 * System.out.println(z);
		 * 
		 * 
		 * sc.close();
		 */
		
		/*
		 * String product1 = "Computer"; String product2 = "Office desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.00; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products: ");
		 * System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		 * System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		 * 
		 * System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age,
		 * code, gender);
		 * 
		 * System.out.printf("Measue with eight decimal place: %.8f %n", measure);
		 * System.out.printf("Rouded (threee decimal places): %.3f %n", measure);
		 * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f%n",
		 * measure);
		 */

	}

}
 