/* programa p imprimir no vídeo os números dentro de um intervalo,
 fornecido pelo usuário */

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {


        //Declaração de variáveis
        Scanner sc = new Scanner(System.in);
        int inicio, fim, contador;


        //Entrada de dados
        System.out.println("Início do intervalo:");
        inicio = sc.nextInt();
        System.out.println("Fim do intervalo:");
        fim = sc.nextInt();

        //Processamento e saída de dados
        contador = inicio;
        while (contador <= fim) {
            System.out.println(contador + " " );
            contador = contador + 1;
        }


    }
}
