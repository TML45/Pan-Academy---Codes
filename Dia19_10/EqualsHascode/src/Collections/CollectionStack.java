package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionStack {
	
	public static void main(String[] args) {
		Deque<Integer> numeros = new ArrayDeque<>();
		
		numeros.add(5);
		numeros.push(5000);
		numeros.push(3500);
		numeros.push(Integer.MAX_VALUE);
		
		System.out.println(numeros);
		System.out.println(numeros.peek());
		System.out.println(numeros.element());
		
		System.out.println(numeros.pop()); // remove e retorna o objeto removido
		System.out.println(numeros.poll());
		System.out.println(numeros.remove());
		
	}

}
