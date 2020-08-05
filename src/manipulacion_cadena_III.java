
public class manipulacion_cadena_III {

	public static void main(String[] args) {
		String persona1="Alejandro";
		String persona2="Alejandro";
		System.out.println(persona1.equals(persona2));

		String persona3="Alejandro";
		String persona4="alejandro";
		System.out.println(persona3.equals(persona4));
		System.out.println(persona3.equalsIgnoreCase(persona4));
		
		String persona6="Eneas";
		String persona7="alejandro";
		System.out.println(persona6.equals(persona7));
	}

}
