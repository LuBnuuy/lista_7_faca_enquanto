package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umid;

        System.out.println("Digite a umidade do ar atual do ambiente para saber se umidade está ideal apara pintura (enter 40% e 60%):");

        do {
            umid = sc.nextInt();
            if (umid < 40 || umid > 80) {
                System.out.println("Ambiente Inadequado.");
                System.out.println("Digite a umidade do ar atual:");
            }
        } while (umid < 40 || umid > 80);
        System.out.println("Ambiente Adequado.");
    }
}
