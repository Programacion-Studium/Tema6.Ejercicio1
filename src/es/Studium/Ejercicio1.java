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
			System.out.println("Escriba un n�mero entero: ");
			numero=teclado.nextInt();
			System.out.println("Has introducido el siguiente n�mero entero: "+numero);
			teclado.close();
		}
		catch(InputMismatchException err)
		{
			System.out.println("No se ha introducido un n�mero entero...");
		}
	}
}