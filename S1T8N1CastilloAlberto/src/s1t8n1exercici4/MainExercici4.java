package s1t8n1exercici4;

import java.util.ArrayList;

public class MainExercici4 {

	public static void main(String[] args) {
		
		ArrayList<String> mesList = new ArrayList<String>();
		mesList.add("Enero");
		mesList.add("Febrero");
		mesList.add("Marzo");
		mesList.add("Abril");
		mesList.add("Mayo");
		mesList.add("Junio");
		mesList.add("Julio");
		mesList.add("Agosto");
		mesList.add("Septiembre");
		mesList.add("Octubre");
		mesList.add("Noviembre");
		mesList.add("Diciembre");
		
		
		mesList.forEach(System.out::println);

	}

}
