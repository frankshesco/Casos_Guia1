package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#.00");
         
         System.out.print("por favor ingrese un precio......: ");
         float sueldo = sc.nextFloat();
         
         System.out.print("Para obtener un 42% de ganacia debe vender el articulo en: " + sueldo * 1.42);
         
		
		
	}

}
