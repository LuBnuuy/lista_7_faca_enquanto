package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0, n, resPorcent;

        System.out.println("Sistem de enchimento de óleo.");

        System.out.print("Digite o tamanho do seu reservatório: ");
        double resTotal = sc.nextInt();

        do {
            System.out.print("Quantos litros deseja abastecer: ");
            n = sc.nextDouble();
            System.out.println("Enchendo...");
            res = res + n;
            resPorcent = (res / resTotal) * 100;
            System.out.println("Capacidade em " + resPorcent + "%.");
        } while (resPorcent < 80);
        if (resPorcent <= 100) {
            System.out.println("Tanque com a capacide ideal " + resPorcent + "% cheio.");
        } else {
            System.out.println("Capacidade máxima do tanque excedida em " + (resPorcent - 100) + "%.");
        }
    }
}
