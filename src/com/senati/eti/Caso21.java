package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese sueldo......: ");
		float sueldo = sc.nextFloat();
		
        float impuesto = 0;
		
		if (sueldo <= 1500)
			impuesto = 0.12f * sueldo;
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = 0.008f * sueldo;
		else if (sueldo > 3000)
			impuesto = 0.12f * sueldo;
		
		float total = sueldo - impuesto;
		
		
		System.out.println("\n----R E S U L T A D O S ------");
		System.out.println("Sueldo bruto..............:  " + sueldo);
		System.out.println("Impuesto a pagar..........:  " + impuesto);
		System.out.println("Total..........:  " + total);
		
		
	   

	}

}
