package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
	    
	    System.out.print("Numeros de aprobados...: ");
		float na = sc.nextInt();
		
		System.out.print("Numeros de desaprobados.: ");
		float nd = sc.nextInt();
		
		System.out.print("Numeros de retirados.: ");
		float nr = sc.nextInt();
		
		float total = na + nd + nr;
		
		float pa = na / total *100;
		float pd = nd / total *100;
		float pr = nr / total *100;
		
		System.out.println("----Resultados------");
		System.out.println("Aprobados......: " + df.format(pa) + "%");
		System.out.println("Desaprobados......: " + df.format(pd) + "%");
		System.out.println("Retirados......: " + df.format(pr) + "%");



	}

}
