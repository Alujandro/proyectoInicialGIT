/**
 * Autor: Alejandro Martinez Hernandez.
 * Descripción: El programa compila y funciona.
 */
import java.util.Scanner;
public class ControlErrores {

	public static void main (String [] args) {
		Integer valor;
		Scanner muchoTexto = new Scanner (System.in);

		System.out.print("Introduce un valor tipo Integer: ");
		while (!muchoTexto.hasNextInt()){
				muchoTexto.nextLine();//Esta línea es necesaria para poder tirar la entrada inválida sin que el programa pete.
				System.out.print("ERROR, entrada inválida, introduzca un valor tipo Integer: ");
		}
		valor=muchoTexto.nextInt();//Esta línea es necesaria para darle valor a nuestra variable y evitar que no haga nada el programa.
		System.out.println("Tu número "+ valor +" es de tipo Integer");
	}
}
