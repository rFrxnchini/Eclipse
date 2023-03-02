package pack;

import java.util.*;
class soma2nr {
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String args[]) {
		//Declaracao
		int num1, num2, soma;
		
		//Leitura
		System.out.println("Digite um nr:");
		num1 = sc.nextInt();
		System.out.println("Digite outro nr:");
		num2 = sc.nextInt();
		
		//Soma
		soma = num1 + num2;
		
		//Print
		System.out.println("Soma=" + soma);
	}
}
