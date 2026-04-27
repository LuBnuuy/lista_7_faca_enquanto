package Atividades.lista_7_faca_enquanto;


public class atv_3 {
    public static void main(String[] args) throws InterruptedException {
        int cont = 0;

        System.out.println("Sensor optico inicializando...");
        Thread.sleep(1000);

        do {
            cont++;
            System.out.println(cont);
            Thread.sleep(50);
        } while (cont < 50);
    }
}
