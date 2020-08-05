
public class manipulacion_cadenas {

	public static void main(String[] args) {
		String nombre="alejandro";
		System.out.println(nombre);
		System.out.println("mi nombres es "+nombre+" y tiene "+nombre.length()+" letras");
		System.out.println("la primera letra de mi nombre es "+nombre.charAt(0));
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("la ultima letra de mi nombre es  "+nombre.charAt(ultima_letra-1));
		

	}

}
