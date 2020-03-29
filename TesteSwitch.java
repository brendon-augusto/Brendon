package br.edu.univas.main;
import java.util.Scanner;
public class TesteSwitch {
	//Brendon Augusto De Souza Nogueira
	private static Scanner teclado;
	private static int a,b;

	public static void main (String[] args) {
 
		teclado = new Scanner(System.in);
		String operador;
		
		do {
		
		
		System.out.println("Opção 1.Somar");
		System.out.println("Opção 2.Subtrair");
		System.out.println("Opção 3.Multiplicação");
		System.out.println("Opção 4.Dividir");
		System.out.println("Opção 9.Sair");
		
		System.out.println("Insira sua opção ");
		 operador = teclado.nextLine();
		 
		 System.out.println(operador);
		 if (!( operador.trim().equals("9"))) {
		
		System.out.println("Digite seu primeiro número");
		a = teclado.nextInt();
		String x = teclado.nextLine();
		
		
		System.out.println("Digite agora seu segundo número");
		b = teclado.nextInt();  
		teclado.nextLine();
		 }
	
        switch (operador) {
        case "1":
            System.out.println( a+"+"+b + "=" +(a+b) ); 
            break;
            
        
        case "2":
            System.out.println ( a+"-"+b + "=" +(a-b) ); 
            break;
        
        case "4":
            System.out.println ( a+"/"+b + "=" +(a/b) ); 
            break;
        
        case "3":
            System.out.println ( a+"*"+b + "=" +(a*b) ); 
            break;
        
        case "9":
        	break;
            
        default:
        	  System.out.println ("Opção invalida");  
            
        }
		} while (!( operador.trim().equals("9")));
    }



		
		
	
	

}
