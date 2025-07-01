import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua avaliação do filme ou digite (0) para encerrar: ");
            nota = leitura.nextDouble();
            if(nota > 0) {
                mediaAvaliacao += nota;
                totalNotas++;
            }else{
                System.out.println("Encerrando programa...");
            }
        }
        System.out.println("Média de avaliações: " + mediaAvaliacao / totalNotas);
    }
}
