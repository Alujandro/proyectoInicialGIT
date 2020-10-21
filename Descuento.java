/**
 * Autor: Alejandro Martinez Hernandez.
 * Descripción: El programa compila y funciona perfectamente.
 * 
 */
import java.util.Scanner;
public class Descuento {

	public static void main (String [] args) {
		double nota;

		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce cantidad: ");
		nota = entrada.nextDouble();

		if (nota>=9 && nota<=10) {
            System.out.println("Excelente");
        }else if (nota>=6.5 && nota<9){
            System.out.println("Notable");
        }else if (nota>=5 && nota<6.5){
            System.out.println("Aprobado");
        }else {
            System.out.println("SUSPENDIDO");
        }
	}
}
