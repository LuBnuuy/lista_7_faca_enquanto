package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int botao;

        System.out.println("Botão de emergencia.");

        do {
            System.out.println("Aperte 0 - OK operação normal.\nAperte 1 - EMERGÊNCIA!");
            botao = sc.nextInt();
            if (botao == 0) {
                System.out.println("Operação normal, continuando...");
            } else if (botao == 1) {
                System.out.println("EMERGENCIA!!!\nOperação finalizada.");
            } else {
                System.out.println("Opção invalida, escolha uma opção valida.");
            }
        } while (botao != 1);
        sc.close();
    }
}