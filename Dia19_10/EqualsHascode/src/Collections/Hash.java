package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet();
//		ArrayList<Usuario> usuarios = new ArrayList();
		
		usuarios.add(new Usuario("Jorge"));
		usuarios.add(new Usuario("Silvia"));
		usuarios.add(new Usuario("Cris"));
		
		System.out.println(usuarios.contains(new Usuario("Jorge")));
		
		
	}

}
