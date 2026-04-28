package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consumo, soma = 0;

        System.out.println("Controle de consumo de energia da maquina, ela deve finalizar apos chegar em 500 kWh.");

        do {
            System.out.print("Digite o consumo de energia(kWh) da máquina: ");
            consumo = sc.nextInt();
            soma = soma+consumo;
            if (consumo<500){
                System.out.println("Consumo de energia limite ainda não alcançado, continuando...");
            }
        }while (consumo<500);
        System.out.println("Consumo de energia limite alcançado.\nConsumo final: "+soma+" kWh.");
    }
}
