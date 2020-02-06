package es.Studium;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio1
{
	public static void main(String[] args)
	{
		try
		{
			int numero;
			Scanner teclado = new Scanner(System.in);
			System.out.println("Escriba un número entero: ");
			numero=teclado.nextInt();
			System.out.println("Has introducido el siguiente número entero: "+numero);
			teclado.close();
		}
		catch(InputMismatchException err)
		{
			System.out.println("No se ha introducido un número entero...");
		}
	}
}