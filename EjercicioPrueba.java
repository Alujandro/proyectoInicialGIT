public class EjercicioPrueba {

	public static void main (String [] args) {
		double a=4;
		double b=2;
		double c=3;

        a=b;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        c=a;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        b= (a+b+c)/2;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

	a= a + c;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        c= b-a;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        c= c-a;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        a= a*b;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        a= a+3;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        a= a%b;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

        c= c+a;
		System.out.println("Loh numeritoh son: " + a + " " + b + " " + c);

	}
}


