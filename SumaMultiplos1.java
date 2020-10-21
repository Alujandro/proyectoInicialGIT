/**
 * Autor: Alejandro Martinez Hernandez.
 * Descripción: El programa compila y funciona.
 */
import java.util.Scanner;
public class SumaMultiplos1 {

	public static void main (String [] args) {
		Integer valor, total=0 , i=0;
		Scanner muchoTexto = new Scanner (System.in);

		System.out.print("Introduce un número: ");

		if (muchoTexto.hasNextInt() && ((valor=muchoTexto.nextInt())>=0)){
			while (i<=valor){
				if ((i%3)==0){
					total=total+i;
				}
				i++;
			}
			System.out.println("La suma de todos los múltiplos de 3 hasta "+ valor +" es: "+ total);
		} else {
			System.out.println("ERROR: valor inválido");
		}
		
	}
}
