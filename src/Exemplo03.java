/* programa p imprimir apenas os numeros impares dentro de um intervalo,
 informado pelo usuario
 */


import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        //Declaração de variáveis
        Scanner sc = new Scanner(System.in);
        int inicio, fim, contador;

        //Entrada de dados
        System.out.println("Início: ");
        inicio = sc.nextInt();
        System.out.println("Fim: ");
        fim = sc.nextInt();

        //Processamento de dados
        if (inicio % 2 == 0) {
            contador = inicio = 1;
        }
        else {
            contador = inicio;
        }

        while (contador <= fim) {
            System.out.println(contador);
            contador = contador + 2;
        }

    }
}
