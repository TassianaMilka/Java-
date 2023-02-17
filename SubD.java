
 

package subd;

import java.util.Scanner;

public class SubD{  //Nome da Classe e entrada do bloco.
	public static void main(String[] args) {
	
	Scanner ler= new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.
	
       //Declaração das Variaveis
	int Sub=0;//Zero para não ocorrer erro.
	int Divi=0;//Zero para não ocorrer erro.
	int numeroD;
	
	System.out.println("Informe o numero para divisao"+"\n");// Entrada de dado ou Entrada de leitura.
	numeroD=ler.nextInt();                                   //Saida de dado ou Saida de leitura.
	
	Sub=53-3;//Conta.
	Divi=Sub/numeroD;//Conta.
	
        //Imprimir os Resultados Finais.
	System.out.println("       A Matematica Realizada  de Subtracao      ");
	System.out.println("********************************************"+"\n");
	System.out.println("O resultado da Subtracao"+"\n"+Sub);
	System.out.println("*********************************************"+"\n"+"\n");
	
	System.out.println("       A Matematica Realizada de Divisao           ");
	System.out.println("**********************************************"+"\n");
	System.out.println("O resultado da Divisao"+"\n"+Divi);
	System.out.println("**********************************************"+"\n"+"\n");
	
	
	
	
	}//Saída do bloco.

}//Saída do bloco.








        
       
    
    

