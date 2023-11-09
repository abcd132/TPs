package tercer_TP;

import java.util.Scanner;

public class tercero {

	public static void main(String[] args) {
		Libro miLibro = new Libro("El Laberinto de las Sombras", "Messi", 180);
		Libro miLibro1 = new Libro("Retrasando a los inmortales", "leo", 550);
		Libro miLibro2 = new Libro("Complaciendo al norte", "pepe", 550);

		Libro[] libros = new Libro[2];
		libros[0] = new Libro("Libro 1", "Autor 1", 100);
		libros[1] = new Libro("Libro 2", "Autor 2", 150);

		for (int i = 0; i < libros.length; i++) {
		    libros[i].mostrarInformacion();
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println(	"Elija una operaci�n (1: Mostrar lista de libros, 2: Buscar un libro por t�tulo, 3: Multiplicaci�n):");

		int operacion = scanner.nextInt();
		int n1 = 10;
		int n2 = 5;

		switch (operacion) {
		case 1:
			System.out.println("hola");
			miLibro.mostrarInformacion();
			miLibro1.mostrarInformacion();
			miLibro2.mostrarInformacion();
			break;
		case 2:

			try {

				System.out.print("Ingrese el t�tulo del libro a buscar: ");
				scanner.nextLine();
				String codigoBuscado = scanner.nextLine();

				boolean encontrado = false;

				for (Libro libro : libros) {
					if (codigoBuscado.equals(libro.getTitulo())) {
						encontrado = true;
						libro.mostrarInformacion();
						break;
					}
				}

				if (!encontrado) {
					if ("El Laberinto de las Sombras".equals(codigoBuscado)) {
						miLibro.mostrarInformacion();
					} else if ("Retrasando a los inmortales".equals(codigoBuscado)) {
						miLibro1.mostrarInformacion();
					} else if ("Complaciendo al norte".equals(codigoBuscado)) {
						miLibro2.mostrarInformacion();
					} else {
						System.out.println("Libro no encontrado en la lista.");
					}
				}

			} catch (java.util.InputMismatchException e) {

				System.out.println("Ingrese un tipo de dato valido vuelva a ingresar un titulo valido");

				scanner.next();
			}

			break;

		case 3:
			int multi = n1 * n2;
			System.out.println("El resultado de la multiplicaci�n es: " + multi);
			break;
		default:
			System.out.println("Operaci�n no v�lida.");

		}
	}

	public static class Libro {
		private String titulo;
		private String autor;
		private int numeroPaginas;

		public Libro(String titulo, String autor, int numeroPaginas) {
			this.titulo = titulo;
			this.autor = autor;
			this.numeroPaginas = numeroPaginas;
		}

		public Object getTitulo() {

			return null;
		}

		public void mostrarInformacion() {
			System.out.println("T�tulo: " + titulo);
			System.out.println("Autor: " + autor);
			System.out.println("N�mero de p�ginas: " + numeroPaginas);
			System.out.println();
		}
	}
}
