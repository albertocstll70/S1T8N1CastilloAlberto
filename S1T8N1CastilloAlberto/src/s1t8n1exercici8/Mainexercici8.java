package s1t8n1exercici8;

public class Mainexercici8 {

	public static void main(String[] args) {

		String cadena = "Hola Mundo";

		IFunctional iR = (x) -> {
			String result = "";
			for (String e : x.split(" ")) {
				result += new StringBuilder(e).reverse().toString() + " ";

			}
			return result;

		};

		System.out.println(iR.reverse(cadena));

	}

}
