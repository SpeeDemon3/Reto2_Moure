package retos2022;
/**
 * 
 * @author speedemon_Antonio Ruiz Benito
 *
 */
public class Reto3 {

	public static void main(String[] args) {

		/*
		 * Reto #2: LA SUCESIÓN DE FIBONACCI
		 * Escribe un programa que imprima los 50 primeros números de la sucesión
		 * de Fibonacci empezando en 0.
		 * - La serie Fibonacci se compone por una sucesión de números en
		 *   la que el siguiente siempre es la suma de los dos anteriores.
		 *   0, 1, 1, 2, 3, 5, 8, 13...
		 */

		int n = 50; // Numero de termino a generar
		int a = 0;  // Primera variable de la sucesion de Fibonacci
		int b = 1;  // Segunda variable de la sucesion de Fibonacci
		
		// Bucle para generar los numeros de la sucesion
		for (int i = 1; i <= n; i++) {
			// Imprimo el valor de a
			System.out.println(a + "");
			// Sumo lo 2 numeros anteriores para generar el siguiente numero
			int suma = a + b;
			// Actualizo a para que sea igual a b
			a = b;
			// Actualizo b para que sea igual a la suma de los 2 numeros anteriores
			b = suma;
		}
		
	}

}
