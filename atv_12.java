package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont = 0;

        System.out.println("Sistema de checagem de refugo (Caso 5 peças forem produzidas com defeito a produção ser interrompida).");

        do {
            System.out.println("Aperte 1 - OK\nAperte 2 - DEFEITO");
            n = sc.nextInt();
            if (n == 1){
                System.out.println("Peça OK, sem defeito.\nContinuando...");
            }else if (n ==2){
                cont++;
                System.out.println("Peça DEFEITUOSA. Contagem de paças defeituosas: "+cont);
                if (cont<5){
                    System.out.println("Continuando...");
                }
            }else {
                System.out.println("Opção invalida!");
            }
        }while (cont<5);
        System.out.println("Limite de peças defituosas produsidas, produção pausada.");
    }
}
