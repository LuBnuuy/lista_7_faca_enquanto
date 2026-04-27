package Atividades.lista_7_faca_enquanto;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;

        System.out.print("Digite seu nome de usuário: ");

        do {
            user = sc.nextLine();
            if (!user.equals("ADMIN")){
                System.out.println("Usuário inexistente.");
                System.out.print("Digite seu nome de usuário: ");
            }
        }while (!user.equals("ADMIN"));
        System.out.println("Seja bem vindo!");
    }
}
