import java.util.Scanner;

public class discord {
	
	public static int suma (int operando1, int operando2) {
		int total = 0;
		total = operando1 + operando2;
		return total;
	}
	
	
	
	public static int leerNumero (String Cadena) {
		
		boolean Control = false;
		int Contador = 0;
		
		do {
			
			Scanner scControl = new Scanner(System.in);
			System.out.println(Cadena);
			Control = scControl.hasNextInt();
			
			if(Control) Contador=scControl.nextInt();
			
		}while(!Control);
		
		return Contador;
		
		
	}
	
	public static void main (String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		char Operacion;
		int resultado=0;
			Scanner sc = new Scanner(System.in);
		
		numero1=leerNumero("Introduce Numero 1:");
	
		numero2=leerNumero("Introduce Numero 2:");
		
		System.out.println("Introduce la operacion: 1.Suma 2.Resta 3.Division 4.Multiplicacion");
		Operacion = sc.next().charAt(0);
		
		switch (Operacion) {
		
		case '1':
			resultado = suma(numero1,numero2);
				break;
		case '2':
			resultado = resta(numero1,numero2);
				break;
		case '3':
			resultado = division(numero1,numero2);
				break;
		case '4':
			resultado = multiplicacion(numero1,numero2);
				break;
		default:
			System.out.print("error");
		}
		
		System.out.print(resultado);
		
	} 