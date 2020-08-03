
public class declaracion_operadores {

	public static void main(String[] args) {
		int a=5;
		int b;
		b=7;
		int c=b+a;
		System.out.println(c);
		c++;
		System.out.println(c);
		c-=6;
		System.out.println(c);
		
		
		
		// conversor a pulgadas
		final double apulgadas=2.54;
		double cm =6;
		double resultado=cm/apulgadas;
		System.out.println("EN "+cm+"centimetros hay"+resultado+"pulgadas");
		
		
		
		// tambien se pueden declara varias variables en una sola linea
		int operador1,operador2;
		operador1=2;
		operador2=5;
		int resultado2=operador1+operador2;
		System.out.println(resultado2);
		

	}

}
