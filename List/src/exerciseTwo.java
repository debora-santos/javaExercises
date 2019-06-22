package exercise;

import java.util.Scanner;

public class exerciseTwo {

	public static void main(String[] args) {
		
/*		double n1, n2, n3;
		double media;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.print("A média foi: " + media);
*/
		
		double gradeSum = 0;
		double list[] = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i < 3; i++) {
			System.out.print("Enter a grade: ");
			list[i] = sc.nextDouble();
			gradeSum = gradeSum + list[i];
		}
		
		System.out.print("The media is: " + gradeSum/3);

	}

}
