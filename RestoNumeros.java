/**
 * Autor: Alejandro Martinez Hernandez.
 * Descripción: El programa compila y funciona.
 */
import java.util.Scanner;
public class RestoNumeros {

	public static void main (String [] args) {
		Integer valor1=0, valor2, i=0;
		Boolean error=false;
		Scanner muchoTexto = new Scanner (System.in);

		System.out.print("Introduce el primer número: ");
		if (muchoTexto.hasNextInt() && ((valor1=muchoTexto.nextInt())>=0)){
			System.out.print("Introduce el segundo número: ");
			if (muchoTexto.hasNextInt() && ((valor2=muchoTexto.nextInt())>=0)){
				while(valor1>=valor2){
					valor1=valor1-valor2;
				}
			} else {
				error=true;
			}
		} else {
			error=true;
		}
		if (error==false){
			System.out.println("El resto es: "+ valor1);
		} else {
			System.out.println("ERROR");
		}
	}
}
