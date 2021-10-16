public class Exercicio2_modificado2 {
	public static void main(String[] args) {
		for (int i = 233; i<=456; ) {
			System.out.println(i);
			i = (i>=300 && i<=400) ? (i +=3) : (i += 5);
		}
	}
}