//22 � Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as vendas.
//Fa�a um programa em Java que receba o sal�rio fixo do funcion�rio e o valor de suas vendas, 
//calcule e mostre a comiss�o e seu sal�rio final. 

import java.util.Scanner;

public class exercicio22{

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o salario fixo: ");
		double salFixo = ler.nextDouble();

		System.out.print("Informe o valor de suas vendas: ");
		double valorVenda = ler.nextDouble();
	
		double comissao = valorVenda + (valorVenda * 4) / 100;
	
		System.out.println("A comissao eh: "+comissao);
		System.out.println("O salario final eh: "+(comissao + salFixo));

}

}