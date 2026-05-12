import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        //Declaração de Variáveis
        Scanner sc = new Scanner(System.in);
        int voto = 1;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;
        int invalidos = 0, totalVotos = 0;
        double pc1, pc2, pc3;

        //Entrada de Dados
        while (voto != 0) {
            System.out.println("[1] Candidato 1\n" +
                    "[2] Candidato 2\n" +
                    "[3] Candidato 3\n" +
                    "[0] Finalizar");
            voto = sc.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto == 1) {
                candidato1++;
                totalVotos++;
            }
            else if (voto == 2) {
                candidato2++;
                totalVotos++;
            }
            else if (voto == 3) {
                candidato3++;
                totalVotos++;
            }
            else {
                invalidos++;
            }

        }
        System.out.println("Candidato 1 = " + candidato1);
        System.out.println("Candidato 2 = " + candidato2);
        System.out.println("Candidato 3 = " + candidato3);
        System.out.println("Inválidos = " + invalidos);

        //Cálculo de Votos
        pc1 = (double) candidato1 / totalVotos * 100;
        pc2 = (double) candidato2 / totalVotos * 100;
        pc3 = (double) candidato3 / totalVotos * 100;

        System.out.println();
        System.out.println("Total de Votos = " + totalVotos);
        System.out.println("Porcentagem Candidato 1 = " + pc1);
        System.out.println("Porcentagem Candidato 2 = " + pc2);
        System.out.println("Porcentagem Candidato 3 = " + pc3);

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Vencedor = Candidato 1" );
        }
        else if (candidato2 > candidato3) {
            System.out.println("Vencedor = Candidato 2");
        }
        else {
            System.out.println("Vencedor = Candidato 3");
        }
    }
}
