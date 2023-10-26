package adivinanza;

import java.util.Random;

import java.util.Scanner;

import java.util.InputMismatchException;

public class juego {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int numintentos  = 0;
		int numeroIngresado;
		int numeroSecreto;

		numeroSecreto = random.nextInt(100) + 1;

		do {
			try {
				System.out.print("Ingresa un número entre 1 y 100: ");
				if (scanner.hasNextInt()) {
					
					numeroIngresado = scanner.nextInt();
					
					validarNumero(numeroIngresado);

					numintentos++;

					if (numintentos == 10) {
						
						System.out.println("Se ha alcanzado el número máximo de intentos");
						break;
					}

					if (numeroIngresado < numeroSecreto) {
						System.out.println("El número secreto es mayor.");
						
					} else if (numeroIngresado > numeroSecreto) {
						System.out.println("El número secreto es menor.");
					} else {
						System.out.println(
								"¡Correcto! Has adivinado el número secreto en " + numintentos + " intentos.");
						break;
						
					}
					
				} else {
					System.out.println("Error: Debes ingresar un número válido.");
					
					
					scanner.nextLine();
				}
			} catch (IllegalArgumentException e) {
				
				System.out.println(e.getMessage() );
			}
		} while (true);

		scanner.close();
	}

	private static void validarNumero(int numero) {
	
		if (numero < 1 || numero > 100) {
			
			throw new IllegalArgumentException("El número debe estar entre 1 y 100.");
		}
	}
}
