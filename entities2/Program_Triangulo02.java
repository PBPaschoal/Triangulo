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

package entities2;

public class Program_Triangulo02 {

	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
