//24 � Fa�a um programa em Java que receba o sal�rio base de um funcion�rio, 
//calcule e mostre seu sal�rio a receber, sabendo-se que o funcion�rio tem gratifica��o de R$ 50 
//e paga imposto de 10% sobre o sal�rio base. 

import java.util.Scanner;

public class exercicio24{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
	
		System.out.print("Digite o salario base: ");
		double salBase = ler.nextDouble();

		double salReceber = salBase - (salBase * 10) / 100;

		System.out.println("O salario a receber eh: "+(salReceber + 50));
}

}