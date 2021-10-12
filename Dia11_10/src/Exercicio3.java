
public class Exercicio3 {
	public static void main(String[] args) {
		int lado1 = 95, lado2 = 25, lado3 = 60;
		
		if(lado1 == lado2 && lado2 == lado1) {
			System.out.println("É um triângulo equilátero");		
		} else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("É um triângulo isósceles");		
		} else {
			System.out.println("É um triângulo Escaleno");		
		}	
	}
}
