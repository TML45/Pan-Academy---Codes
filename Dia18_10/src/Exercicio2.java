import java.util.ArrayList;

public class Exercicio2 {
	public static void main(String[] args) {
		int[] array = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		ArrayList<Integer> par=new ArrayList<Integer>();
		ArrayList<Integer> impar=new ArrayList<Integer>();
		
		for(int i : array) {
			if(i%2 == 0) {
				par.add(i);
			}else {
				impar.add(i*2);				
			}
		}
		System.out.println("Os numeros pares são " + par);
		System.out.println("Os numeros impares multiplicados por 2 são " + impar);
	}

}
