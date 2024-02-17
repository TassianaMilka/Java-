//Programando em Java 14
//packed supermecadovetor;

//Em um supermecado público contém uma sequência de números utilizando  vetor definido pelo  o 
//usuário no momento da compilação necessitando que possa realizar um cálculo conforme 
//o total do produto comprado pelo consumidor na finalidade de dividir pelo número dois,pois
//o resultado vai para classificar os pontos do cartão de forma equivalente no final do mês conter 
//produto de R$15,00 até R$200,00.Nesse caso o comércio contém uma parte também para 
//rebolso dela de até R$10,00 na forma que subtrai e a outra metade destinado para uma doação 
//de organização pública destina as crianças, os  adolescentes e os  jovens  das classe baixa com 
//boas notas para fazerem cursos no desenvolvimento de inovação desde da tecnologia,econômica e 
//ciência.Lembrando é só para quem usar o cartão caso contrário não estará incluído e definido para
//compra acima que R$50.

import java.util.Scanner;

public class supermecadovetor {// Entrada de bloco e nome da classe

    /**
     * @param args
     */
    public static void main(String[] args) {// Entrada de bloco

        Scanner ler = new Scanner(System.in);// Comando utilizado para fazer a leitura dos dados digitados na leitura.

        // Declaração das variáveis
        int i;
        int n = 8;
        int num[] = new int[n];
        int escolha;
        double valor1;
        double valor2;
        double cal = 0;
        double calfinal = 0;

        // Laço de repetição de i até 8
        for (i = 0; i < n; i++) {

            System.out.println("Informe os números");// Entrada de dado
            num[i] = ler.nextInt();// Saída de dado

            // Imprimir a mensagem sobre os números dos caixas
            System.out.println("Números informados sobre os caixa do supermecado" + "\n");
            System.out.println("-----------------------------------------------------------------------" + "\n");
            System.out.println(num[i]);
            System.out.println("========================================================================");
            System.out.println("\n+\n");

        }
        System.out.println("Informe se o cliente comprou -[1]-Não e [2]-Sim");// Entrada de dado
        escolha = ler.nextInt();// Saída de dado

        // Validação de dado igual(==)
        if (escolha == 1) {

            System.out.println("Informe o total  do valor");// Entrada de dado
            valor1 = ler.nextDouble();// Saída de dado

            // Imprimir a mensagem para classificar o resultado final da compra
            System.out.println("O valor da compra" + "\n");
            System.out.println(valor1);

            System.out.println("\n\n");

            // Imprimir a mensagem para classificar
            System.out.println("Agradeçemos pela sua compra conosco.Volte sempre!");

        }
        // Validação de dado igual(==).
        else if (escolha == 2) {

            System.out.println("Informe o valor total ");// Entrada de dado
            valor2 = ler.nextDouble(); // Saída de dado

            // Imprimir a mensagem para classificar o resultado final da compra
            System.out.println("O valor da compra" + "\n");
            System.out.println(valor2);

            // Realizando o cálculo
            cal = valor2 / 2;

            // Imprimir a mensagem para classificar o resultado do cálculo anteriormente
            System.out.println("O resultado do cálculo para adicionar  pontuação no cartão " + "\n");
            System.out.println(cal);

            // Realizando o cálculo
            calfinal = cal - 10;

            // Imprimir a mensagem para classificar o resultado do cálculo anteriormente
            System.out.println("O resultado do cálculo destinado para doação" + "\n");
            System.out.println(calfinal);

            System.out.println("\n\n");
            // Imprimir a mensagem para classificar
            System.out.println("Agradeçemos pela ajuda nesse projeto e pela compra conosco.Volte sempre!");

        }

    }// Saída de dado

}// Saída de dado