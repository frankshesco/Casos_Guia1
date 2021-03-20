package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese base:\t");
	     float base = sc.nextFloat();
	     
	     System.out.print("Ingrese altura:\t");
	     float altura = sc.nextFloat();
	         
	     float area = (base*altura)/2;
	         
	     System.out.print("El area del Triangulo es:" + area);
	    
	}

}
