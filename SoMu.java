
package somu;

 //Programando em Java(1) or Programming in Java(1).
//Faça um programa que contém o número que soma o 3+5, depois fazer uma multiplicação do 
//resultado da conta com outro número digitado e no final aparecer uma mensagem descrita 
//desda maneira o resultado final da soma e também da multiplicação.

import java.util.Scanner;

public class SoMu {//Nome da  Classe e entrada de bloco

  

public static void main(String[] args) {//Entrada de bloco
  
    
Scanner ler= new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.



//Declaração das variáveis.

int numeroP; 
int numeroS;
int numeroT;
int  soma=0; // Zero para não ocorrer erro.
int  multi=0;//Zero para não ocorrer erro.


System.out.println("Informe o primeiro numero da soma"); //Entrada de dado ou Leitura de entrada.
numeroP=ler.nextInt();                                   //Saída de dado ou  Leitura de saída.

System.out.println("Informe o segundo numero da soma");//Entrada de dado ou Leitura de entrada.
numeroS=ler.nextInt();                                //Saída de dado ou Leitura de saída.


System.out.println("Informe o terceiro numero da multiplicacao");//Entrada de dado ou Leitura de entrada.
numeroT=ler.nextInt();                                          //Saída de dado  ou Leitura de saída.

soma=numeroP+numeroS;//Conta.
multi=soma*numeroT; //Conta.

//Imprimir os resultados finais.
System.out.println("*****************************************************************"+"\n");
System.out.println("                    Matematica Realizada da Soma          ");
System.out.println("O resultado final da soma"+"\n"+soma);
System.out.println("******************************************************************"+"\n");
System.out.println("               Matematica Realizada da Multiplicacao     ");
System.out.println("O resultado final da multiplicacao"+"\n"+multi);
System.out.println("**********************************************************************"+"\n");


     }//Saída de bloco.

  
}//Saída de bloco.
