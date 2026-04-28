package Atividades.lista_7_faca_enquanto;

public class atv_19 {
    public static void main(String[] args) {
        int rpmAtual = 0; // Motor começa parado
        int rpmLimite = 3000;
        int incremento = 500;

        System.out.println("Iniciando aceleração do motor...");

        while (rpmAtual <= rpmLimite) {
            System.out.println("Rotação atual: " + rpmAtual + " RPM");
            rpmAtual = rpmAtual + incremento;
        }
        System.out.println("Limite de 3000 RPM atingido. Estabilizando motor.");
    }
}
