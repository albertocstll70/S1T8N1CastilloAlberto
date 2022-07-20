package s1t8n1exercici7;

import java.util.ArrayList;
import java.util.Collections;

public class MainExercici7 {

	public static void main(String[] args) {

		ArrayList<Object> lista = new ArrayList<>();

		lista.add("1213sadasdsadsa");
		lista.add("hola mundo");
		lista.add(246810121);
		lista.add("No inventes la rueda");
		lista.add(132546);
		lista.add("No inventes la rueda otro ya lo ha hecho por ti ");
		lista.add("maratón  primero  ritmo  lento después ….");
		lista.add(2123132);

		Collections.sort(lista, (x, y) -> Integer.signum(y.toString().length() - x.toString().length()));		
		lista.forEach(x -> System.out.println(x));

	}
}
