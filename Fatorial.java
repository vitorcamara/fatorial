package com.vitorcamara.projetos;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero:");
		int num = scan.nextInt();

		System.out.println("FATORIAL DE: " + num);
		System.out.print(num + "! = ");

		int fatorial = 1;
		for (int i = num; i > 1; i--) { //o contador recebe o número fornecido, e enquanto o número for maior que 1, o contador perde 1

			fatorial *= i; //fatorial recebe cada novo número do contador multiplicado pelo número anterior do contador
			System.out.print(i + ".");

		}
		System.out.print("1 = " + fatorial); 
	}

}
