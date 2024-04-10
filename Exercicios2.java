package exercicios_1004;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um valor: ");
		double a = sc.nextDouble();
		
		String msng = a % 5 == 0 ? "Multiplo de 5": "Não é multiplo de 5";
		System.out.println(msng);
		sc.close();
		

	}

}
