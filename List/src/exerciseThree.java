package exercise;

import java.util.Scanner;

public class exerciseThree {
	
	public static void main(String[] args) {

/*		double nota1, nota2, nota3;
		int peso1, peso2, peso3;
		double mediaPonderada;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite o peso da primeira nota: ");
		peso1 = ler.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Digite o peso da segunda nota: ");
		peso2 = ler.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.print("Digite o peso da terceira nota: ");
		peso3 = ler.nextInt();
		
		mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		
		System.out.print("A média ponderada é: " + mediaPonderada);
*/

		double weightedAverage;
		double grade[] = new double[3];
		double weight[] = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter a grade: ");
			grade[i] = sc.nextDouble();
			
			System.out.print("Enter a weight: ");
			weight[i] = sc.nextDouble();
		}
		
		weightedAverage = ( (grade[0] * weight[0]) + (grade[1] * weight[1]) + (grade[2] * weight[2]) ) / (weight[0] + weight[1] + weight[2]);
		
		System.out.print("The weighted average is: " + weightedAverage);
		
	}
}
