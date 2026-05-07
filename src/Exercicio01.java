import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        //Declaração de Variáveis
        Scanner sc = new Scanner(System.in);
        int contador = 1, valor, maior = Integer.MIN_VALUE;

        while (contador <= 5) {
            System.out.println("Valor: ");
            valor = sc.nextInt();
            if (valor > maior) {
                maior = valor;
            }
            contador = contador + 1;
        }
        System.out.println("maior = " + maior);
    }
}
