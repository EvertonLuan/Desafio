import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
		
	int lin, col, lin2, col2;
	
	
		System.out.println("Digite a linha que a torre se encontra: ");
		lin = leitor.nextInt();
		System.out.println("Digite a coluna que a torre se encontra: ");
		col = leitor.nextInt();
		
		
		System.out.println("   1  2  3  4  5  6  7  8 ");
		System.out.println("   ---------------------- ");
		
		if (lin >=1 && col >=1 && lin <=8 && col <=8 )
		{
		for ( lin2 = 1; lin2 <=8; lin2++) {
			System.out.print(lin2+"|");
			
		for (col2 = 1; col2 <=8; col2++) {
			
		if 	(lin == lin2 || col == col2) 
			System.out.print(" x ");
		
		else 
			System.out.print(" - ");
		
		}
		System.out.println("");
		}
		}
		else {
			System.out.println("Erro 654615");
		
		
		
		
		
		
	}
	}
}
