package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoReserva = 50.0;
        double lanceAtual;

        System.out.println("Início do Leilão de Peças Customizadas");
        System.out.println("O preço de reserva é: R$ " + precoReserva);

        do {
            System.out.print("Digite o valor do seu lance: R$ ");
            lanceAtual = sc.nextDouble();
            if (lanceAtual < precoReserva) {
                System.out.println("Lance insuficiente! O valor precisa ser de ao menos R$ " + precoReserva);
            }
        } while (lanceAtual < precoReserva);
        System.out.println("Lance aceito! Peça vendida por: R$ " + lanceAtual);
        sc.close();
    }
}
