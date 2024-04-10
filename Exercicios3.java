package exercicios_1004;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Anos trabalhados: ");
		int anos = sc.nextInt();
		
		String mnsgn = anos <= 3 ? "Você receberá 5% de bônus":"Você receberá 7% de bônus"; 
		System.out.println(mnsgn);
		
		sc.close();

	}

}
