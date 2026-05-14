import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        //Programa em Java para ler um valor inteiro. Imprima a qtd de n pares e n ímpares.

        Scanner sc = new Scanner(System.in);

        int valor, qtdPar = 0, qtdImpar = 0;
        int digito;

        System.out.println("Valor: ");
        valor = sc.nextInt();

        while (valor != 0) {
            digito = valor % 10;
            if (digito % 2 == 0) {
                qtdPar++;
            }
            else {
                qtdImpar++;
            }
            valor = valor / 10;
        }
        System.out.println("Quantidade de Pares: " + qtdPar);
        System.out.println("Quantidade de Ímpares: " + qtdImpar);
    }
}
