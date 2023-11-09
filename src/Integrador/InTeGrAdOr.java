package Integrador;

public class InTeGrAdOr {

	public static String[] nombres = new String[3];
	public static String[] apellidos = new String[3];
	public static int[] numerosDeCamiseta = new int[3];

	public static void main(String[] args) {

		nombres[0] = "pepito";
		apellidos[0] = "gutierrez";
		numerosDeCamiseta[0] = 5;

		nombres[1] = "Leonel";
		apellidos[1] = "Pessi";
		numerosDeCamiseta[1] = 7;

		nombres[2] = "fribu";
		apellidos[2] = "Martinez";
		numerosDeCamiseta[2] = 12;

		for (int i = 0; i < 3; i++) {
			System.out.println("Jugador " + (i + 1));
			System.out.println("Nombre: " + nombres[i]);
			System.out.println("Apellido: " + apellidos[i]);
			System.out.println("Número de camiseta: " + numerosDeCamiseta[i]);
			System.out.println();

		}

	}
}
