//11 � Fa�a um programa em Java que receba o valor do sal�rio m�nimo e o valor do sal�rio de um funcion�rio, 
//calcule e mostre a quantidade de sal�rios m�nimos que esse funcion�rio ganha.

import java.util.Scanner;

public class exercicio11{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite o salario minimo: ");
		double salMinimo = ler.nextDouble();

		System.out.print("Digite o salario do funcionario: ");
		double salF = ler.nextDouble();
		
		double quantidade = salF / salMinimo;

		System.out.println("A quantidade de salarios minimo que o funcionario ganha eh: "+quantidade);

}

}