package Atividades.lista_7_faca_enquanto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;

        do {
            System.out.print("Digite o seu crachá: ");
            usuario = sc.nextLine();

            if(!usuario.startsWith("SENAI-")){
                System.out.println("Erro, o crachá deve começar com 'SENAI-'.\nTente novamente.");
            }
        }while (!usuario.startsWith("SENAI-"));
        System.out.println("Crachá validado com sucesso: "+ usuario);
        sc.close();
    }
}