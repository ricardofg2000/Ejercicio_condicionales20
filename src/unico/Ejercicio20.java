package unico;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*
Una pastelería nos ha pedido realizar un programa que 
haga presupuestos de tartas. El programa preguntará primero de qué 
sabor quiere el usuario la tarta: manzana, fresa o chocolate. 
La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar 
la tarta de chocolate, el programa debe preguntar además si el chocolate es 
negro o blanco; la primera opción vale 14 euros y la segunda 15. 
Por último se pregunta si se añade nata y si se personaliza con un nombre; 
la nata suma 2.50 y la escritura del nombre 2.75.

Ejemplo 1:

Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14,00 €
Con nata: 2,50 €
Total: 16,50 €
Ejemplo 2:

Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
¿Quiere ponerle un nombre? (si o no): si
Tarta de manzana: 18,00 €
Con nombre: 2,75 €
Total: 20,75 €
Ejemplo 3:

Elija un sabor (manzana, fresa o chocolate): fresa
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): si
Tarta de fresa: 16,00 €
Con nata: 2,50 €
Con nombre: 2,75 €
Total: 21,25 €

		 */

		Scanner leer = new Scanner(System.in);
		
		final double pmanzana = 18.00;
		final double pfresa = 16.00;		
		final double pnegro = 14.00;
		final double pblanco = 15.00;
		final double pnata = 2.50;
		final double pnombre = 2.75;
		String sabor;
		String chocolate = null;
		String opcNata;
		String opcNombre;
		double psabor = 0;
		double total = 0;
		
		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		sabor = leer.nextLine();
		switch(sabor) {
		case "chocolate":System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
			chocolate = leer.nextLine();
			switch (chocolate) {
			case "negro": psabor = pnegro; sabor = "chocolate negro";break;
			case "blanco":psabor = pblanco; sabor = "chocolate blanco";break;
			}
		break;
		case "fresa":psabor = pfresa;break;
		case "manzana":psabor = pmanzana;break;
		}
		total =psabor;
		
		System.out.print("¿Quiere nata? (si o no): ");
		opcNata = leer.nextLine();
		System.out.print("¿Quiere ponerle un nombre? (si o no): ");
		opcNombre = leer.nextLine();
		
		
		System.out.println("Tarta de " + sabor + ": " + psabor + " €");
		
		if (opcNata.equals("si")) {
			System.out.println("Con nata: " + pnata + " €");
			total = total + pnata;
		}
		
		if (opcNombre.equals("si")) {
			System.out.println("Con nombre: " + pnombre + " €");
			total = total + pnombre;
		}

		System.out.println("Total: " + total + " €");
	}

}
