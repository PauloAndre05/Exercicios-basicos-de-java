//21 � Fa�a um programa em Java que receba o sal�rio base de um funcion�rio, calcule e mostre o sal�rio a receber, 
//sabendo-se que o funcion�rio tem gratifica��o de 5% sobre o sal�rio base e paga imposto de 7% tamb�m sobre o sal�rio base. 

import java.util.Scanner;

public class exercicio21{

	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite o salario do funcionario: ");
		double salF = ler.nextDouble();
	
		double salReceber = salF + (salF * 5) / 100;
       	        salReceber =  salReceber - ( salReceber * 7) / 100;
		
		System.out.println("\nO salario a receber eh: "+ salReceber);
	

}

}