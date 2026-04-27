package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;

        System.out.println("Digite a temperatura da extrusora, o sistema vai continuar pedindo a temperatura enquanto a temperatura for inferior a 180º:");

        do {
            System.out.println("Digite a temperatura da extrusora:");
            temp = sc.nextDouble();
        } while (temp < 180);
        System.out.println("Sistema finalizado.");
        sc.close();
    }
}
