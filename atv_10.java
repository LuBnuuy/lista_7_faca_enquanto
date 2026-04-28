package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, media, soma = 0, cont = 0;

        System.out.println("Digite a quantidade de peças produzidas em cada turno, o sistema vai calcular a média final.");

        do {
            cont++;
            System.out.print("Digite a quantidade de peças produzidas no turno " + cont + ": ");
            n = sc.nextInt();
            soma = soma + n;
        } while (cont < 5);
        media= soma/cont;
        System.out.println("A média de produção é de "+media+" peças.");
    }
}
