
public class Calculos_conMath {

	public static void main(String[] args) {
		// primero
		double raiz=Math.sqrt(9);
		System.out.println(raiz);
		
		// segundo
		double num1=5.85;
		int resultado=(int)Math.round(num1);
		System.out.println(resultado);
		// round
		float num2=5.85F;
		int resultado2=Math.round(num2);
		System.out.println(resultado2);
		// pow
		
		double base=5;
		double exponente=3;
		
		double resultado3=Math.pow(base,exponente);
		System.out.println(resultado3);
		
		// final
		
		System.out.println("la raiz cuadrada de 9 es  "+raiz+"  el round de  "+num1+" es "+resultado2+" la potenciacion es  "+resultado3);
		

	}

}
