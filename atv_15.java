package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tempoT = 0;

        System.out.println("Digite o tempo de cada missão do seu drone (em horas), o sistema vai calcular se ele precisa de manutenção.");

        do {
            System.out.print("Digite quantas horas durou o voo: ");
            n = sc.nextInt();
            tempoT = tempoT + n;
            System.out.println("Tempo total de voo " + tempoT + " horas.");
        } while (tempoT < 20);
        System.out.println("Manutenção nessessaria.");
    }
}
