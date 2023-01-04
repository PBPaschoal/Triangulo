/* Aula 65  
 * Problema exemplo:
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
 * Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
 * 
 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron):
 * p = a + b + c sobre 2
 * Exemplo:
 * Digite as medidas do triângulo X:
 * 3.00
 * 4.00
 * 5.00
 * Digite as medidas do triângulo Y:
 * 7.50
 * 4.50
 * 4.02
 * Triângulo X area: 6.0000
 * Triângulo Y area: 7.5638
 * Larger area: Y */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Program_Triangulo02;

public class Triangulo2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Program_Triangulo02 x, y;
		x = new Program_Triangulo02();
		y = new Program_Triangulo02();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.c = teclado.nextDouble();
		System.out.println("Enter the measures of triangule Y: ");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();
		y.c = teclado.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		teclado.close();
	}
}
