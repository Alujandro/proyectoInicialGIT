/**
 * Autor: Alejandro Martinez Hernandez.
 * Descripción: El programa compila y funciona.
 */
import java.util.Scanner;
public class ControlErrores2 {

	public static void main (String [] args) {
		Integer valor;
		Boolean error=false;
		Scanner muchoTexto = new Scanner (System.in);

		System.out.print("Introduce un valor entre 0 y 10: ");
		do {
			if (error){
				muchoTexto.nextLine(); //Esta mierda es para tirar el valor inválido a la "basura".
			}
			if (muchoTexto.hasNextInt()){
				valor=muchoTexto.nextInt(); //No olvidemos que sin esto el valor siempre será nulo
				System.out.println("Muy bien, crack, "+ valor +" es un buen numerito.");
				error=false;
			} else {
				error=true;
				System.out.print("ERROR, entrada inválida, introduzca un valor entre 0 y 10: ");
			}
		} while (error); //Asegúrate de no poner = en vez de == porque en vez de comparar asigna ese valor.
	}
}
