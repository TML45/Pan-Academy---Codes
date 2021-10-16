
public class Exercicio2 {
	public static void main(String[] args) {
		int inicial = 233;
		
		while(inicial<=456){
		if(inicial<300) {
			System.out.println(inicial);
			inicial += 5;}
		else if(inicial>=300 && inicial<=400) {
			System.out.println(inicial);
			inicial +=3;}
		else if(inicial> 400) {
			System.out.println(inicial);
			inicial += 5;}
    }
	}
}