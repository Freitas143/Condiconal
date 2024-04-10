package exercicios_1004;

import java.util.Scanner;

public class Diadasemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	    int dia;
	    System.out.println("Informe o dia da semana: ");
	    dia = sc.nextInt();
	    
	    switch (dia) {
	    	case 1:
	    		System.out.println("Domingo");
	    		break;
	    	case 2:
	    		System.out.println("Segunda");
	    		break;
	    	case 3:
	    		System.out.println("Terça");
	    		break;
	    	case 4:
	    		System.out.println("Quarta");
	    		break;
	    	case 5:
	    		System.out.println("Quinta");
	    		break;
	    	case 6:
	    		System.out.println("Sexta");
	    		break;
	    	case 7:
	    		System.out.println("Sabádo");
	    		break;
	    	default:
	    		System.out.println("Dia inválido");
	    	
	    }
		sc.close();
		

	}

}
