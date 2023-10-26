package tp2;

import java.util.Scanner;

public class segundoTP {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char opcion;

		do {
			menu();
			int n1 = obtenerNumero("Ingresa el primer numero: ");
			int n2 = obtenerNumero("Ingresa el segundo numero: ");

			System.out.println("Selecciona el tipo de operaci�n a realizar: ");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicaci�n");
			System.out.println("4. Divisi�n");
			int operacion = entrada.nextInt();

			switch (operacion) {
			case 1:
				int suma = sumar(n1, n2);
				System.out.println("El resultado de la suma es: " + suma);
				break;
			case 2:
				int resta = restar(n1, n2);
				System.out.println("El resultado de la resta es: " + resta);
				break;
			case 3:
				int multi = multiplicar(n1, n2);
				System.out.println("El resultado de la multiplicaci�n es: " + multi);
				break;
			case 4:
				try {
					int division = dividir(n1, n2);
					System.out.println("El resultado de la divisi�n es: " + division);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Opci�n no v�lida, elige otra.");
			}

			System.out.print("�Desea realizar otra operaci�n? (S/N): ");
			opcion = entrada.next().charAt(0);
		} while (opcion == 'S' || opcion == 's');
	}

	public static void menu() {
		System.out.println(
				"Seleccione el tipo de operaci�n que desea realizar entre suma, resta, multiplicaci�n o divisi�n");
	}

	public static int obtenerNumero(String mensaje) {
		Scanner entrada = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(mensaje);
				return Integer.parseInt(entrada.nextLine());
				
			} catch (NumberFormatException e) {
				System.out.println("Error: Debes ingresar un n�mero entero.");
			}
		}
	}

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir por cero.");
		} else {
			return a / b;
		}
	}
}