
public class manipulacion_cadenas_II {

	public static void main(String[] args) {
		String frase="hoy es un dia estupendo para aprender a programar en java";
		String frase_resumen=frase.substring(29, 57);
		System.out.println(frase_resumen);
		String frase_resumen1=frase.substring(0,29);
		System.out.println(frase_resumen1+" ir a la playa");
		System.out.println("quiero "+frase_resumen +" y");
		String frase_resumen2=frase.substring(7,23);
		System.out.println(frase_resumen2+" para ir a la playa");
	}

}
