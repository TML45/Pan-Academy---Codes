
public class Exercicio2_modificado {
	public static void main(String[] args) {
		int[] array = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		
		System.out.printf("Os numeros pares são: ");
		for(int i : array) {
			if(i%2 == 0) {
				System.out.printf("%d, ",i);
			}
		}
		System.out.printf("%nOs numeros impares multiplicados por 2 são: ");
		for(int i : array) {
			if(i%2 != 0){
				System.out.printf("%d, ",i*2);				
			}
		}
	}

}
