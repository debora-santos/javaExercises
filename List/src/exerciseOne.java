package exercise;

import java.util.Scanner;

public class exerciseOne {

	public static void main(String[] args) {
		
/*		double n1, n2, n3, n4;
		double soma;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		n1 = ler.nextDouble();
		
		System.out.print("Digite outro número: ");
		n2 = ler.nextDouble();
		
		System.out.print("Digite mais outro número: ");
		n3 = ler.nextDouble();
		
		System.out.print("Digite um último número: ");
		n4 = ler.nextDouble();		
		
		soma = n1+n2+n3+n4;
		
		System.out.print("A soma dos quatro números digitados é: " + soma);
*/
		
		
		int sum=0;	//Inicializo minha variável como sendo zero
		int number[] = new int[4];		//Chamo array pois vou usá-lo no for
		
		Scanner sc = new Scanner(System.in);	//Chamo classe Scanner pois meu usuário vai digitar um número e vou guardá-lo
		
		for (int i=0; i < 4; i++) { 
			System.out.print("Enter an integer: ");
			number[i] = sc.nextInt(); 	//Meu array recebe o numero que o usuario digitar
			sum = sum + number[i];		//A soma é feita de forma automática, sum inicializa com 0 + numero que o usuario digitar (armazenado na variavel number[i])
		}
		
		System.out.print("The sum of the numbers is: " + sum);
		
	}

}
