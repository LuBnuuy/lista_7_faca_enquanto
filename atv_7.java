package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha, cont = 0;

        System.out.print("Digite sua senha: ");

        do {
            senha = sc.nextInt();

            if (senha != 1234) {
                cont = cont + 1;
                System.out.println("Senha incorreta.");
                System.out.println("Restam " + cont + " tentativas.");
                System.out.print("Digite a senha correta: ");
            }if (cont==3){
                System.out.println("Tentativas excedidas");
                sc.close();
            }

        } while (senha != 1234 );

        String result = (cont <= 0) ? "Tentativa excedidas." : "Seja bem vindo!";
        System.out.println(result);


    }
}



