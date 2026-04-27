package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        double press, pressBar = 0;

        System.out.println("Monitoramente de Pressão, a pressão da caldeira não pode ser menor que 10 bar.");
        Thread.sleep(1000);

            System.out.println("Escolha a unidade de mediada que você quer usar:");
            System.out.println("1 - bar");
            System.out.println("2 - psi");
            System.out.println("3 - Pascal (Pa)");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

        do {
            switch (opcao) {
                case 1:
                    System.out.println("Unidade selecionada: bar");
                    System.out.print("Digite o valor da preção: ");
                    press = sc.nextDouble();
                    pressBar = press;
                    if (pressBar < 10) {
                        System.out.printf("Pressão de bar %.2f bar é insuficiente (mínimo 10 bar).%n", pressBar);
                        Thread.sleep(1000);
                    }
                    break;

                case 2:
                    System.out.println("Unidade selecionada: psi");
                    System.out.print("Digite o valor da preção: ");
                    press = sc.nextDouble();
                    pressBar = press * 0.0689476;
                    if (pressBar < 10) {
                        System.out.printf("Pressão de bar %.2f bar é insuficiente (mínimo 10 bar).%n", pressBar);
                        Thread.sleep(1000);
                    }
                    break;

                case 3:
                    System.out.println("Unidade selecionada: Pascal");
                    System.out.print("Digite o valor da preção: ");
                    press = sc.nextDouble();
                    pressBar = press / 100000;
                    if (pressBar < 10) {
                        System.out.printf("Pressão de bar %.2f bar é insuficiente (mínimo 10 bar).%n", pressBar);
                        Thread.sleep(1000);
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Reiniciando leitura...");
                    pressBar = 0;
                    Thread.sleep(1000);
                    System.out.println("Escolha a unidade de mediada que você quer usar:");
                    System.out.println("1 - bar");
                    System.out.println("2 - psi");
                    System.out.println("3 - Pascal (Pa)");
                    System.out.print("Opção: ");
                    opcao = sc.nextInt();
            }
        } while (pressBar < 10);
        System.out.printf("Pressão de %.2f bar estabilizada.", pressBar);
        sc.close();

    }
}
