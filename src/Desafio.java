import java.util.Scanner;

//Exercicio realizado para reforçar fundamentos de estruturas em JAVA
//Programa executa tranferências bancárias básicas





public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Primeiro, digite os dados de usuário ");
        System.out.println("Nome: ");
        String nome = leitor.nextLine();
        System.out.println("Tipo de conta: ");
        String tipoConta = leitor.nextLine();
        System.out.println("Saldo INICIAL: ");
        double saldoAtual = leitor.nextDouble();
        int op;
        do {
            System.out.println("===========================================");
            System.out.println("============ DADOS DO CLIENTE =============");
            System.out.println("===========================================");
            System.out.println("NOME: " + nome + " | Tipo de conta: " + tipoConta + " | Saldo ATUAL: " + saldoAtual);
            System.out.println("===========================================");
            System.out.println("OPERAÇÕES: ");
            System.out.println("Consultar saldo:  (1) ");
            System.out.println("Receber valor:    (2) ");
            System.out.println("Transferir valor: (3) ");
            System.out.println("SAIR DO PROGRAMA  (4) ");
            System.out.println("===========================================");
            System.out.println("DIGITE UM NÚMERO VÁLIDO: ");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("SALDO ATUAL: " + saldoAtual);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    double valorRecebido = leitor.nextDouble();
                    saldoAtual = valorRecebido + saldoAtual;
                    break;
                case 3:
                    System.out.println("Digite a chave PIX: ");
                    int chavePIX = leitor.nextInt();
                    System.out.println("Roberto carlos | Bradesco | PIX: " + chavePIX);
                    System.out.println("VALOR DA TRANSFERÊNCIA: ");
                    double valorTranferido = leitor.nextDouble();
                    if(saldoAtual > valorTranferido){
                        System.out.println("Valor TRANSFERIDO: " + valorTranferido);
                        saldoAtual = saldoAtual - valorTranferido;
                        System.out.println("saldo ATUAL: " + saldoAtual);
                    }
            }
        }while(op != 4);
        System.out.println("Encerrando programa...");
    }
}
