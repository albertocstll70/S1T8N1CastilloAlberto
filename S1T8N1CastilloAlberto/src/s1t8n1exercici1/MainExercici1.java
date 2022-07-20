package s1t8n1exercici1;

import java.util.ArrayList;

public class MainExercici1 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Gris");
		lista.add("Azul");
		lista.add("Marron");
		lista.add("Dorado");
		lista.add("Rojo");
		lista.add("Verde");
		lista.add("Naranja");
		lista.add("Blanco");
		lista.add("Plata");
		
		lista.stream().filter(list -> list.contains("o")).forEach(System.out::println);
	
		
		
		

	}

}
