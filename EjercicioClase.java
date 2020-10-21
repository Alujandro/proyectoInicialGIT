import java.util.Scanner;
public class EjercicioClase {

	public static void main (String [] args) {
		double num1, num2, resultado;

		Scanner muchoTexto = new Scanner (System.in);
		System.out.println("Dame numerito uno: ");
		num1 = muchoTexto.nextDouble();
		System.out.println("Dame numerito dó: ");
		num2 = muchoTexto.nextDouble();
		System.out.println("Tu ecuasionga es: \n" + num1 + "x + " + num2 + " = 0");
		resultado = -(num2/num1);
		System.out.println("Equis es igual a: " + resultado);
	}
}


