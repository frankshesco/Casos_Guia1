package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		//aplicar CAST: convertir un tipo de dato a otro
		int res1 = (int) Math.pow(5, 3);
		
		float res2 = (float) Math.pow(81, 1/2.0);
		
		float res3 = (float) Math.pow(120, 1/3.0);
		
		float res4 = (float) Math.pow(256, 1/4.0);

		float res5 = (float) Math.pow(25, 1/2.0);
		
		float res6 = res4 + res5;
		
		 System.out.println("----Resultados------");
		 System.out.println("Resultado 1......: " + res1);
		 System.out.println("Resultado 2......: " + res2);
		 System.out.println("Resultado 3......: " + res3);
		 System.out.println("Resultado 4......: " + res6);

	}

}
