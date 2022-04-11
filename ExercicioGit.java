/*Uma empresa contrata programadores para desenvolver projetos em suas casas. Faça um programa que pergunte ao usuário qual o valor pago a ele por hora de trabalho 
e quantas horas ele trabalhou em um projeto. Em seguida, mostre o valor equivalente a ser recebido por ele.  
Lembre-se de formatar os números.*/

package exgit;

import java.util.Scanner;

public class ExercicioGit {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe qual o valor pago por hora: ");
	float valor = teclado.nextFloat();
	System.out.println("Quantas horas voce trabalhou: ");
	float horas = teclado.nextFloat();
	
    float valorfinal = valor*horas;
    System.out.println("O valor a ser pago eh:" +valorfinal);
    teclado.close();
	

	}

}
