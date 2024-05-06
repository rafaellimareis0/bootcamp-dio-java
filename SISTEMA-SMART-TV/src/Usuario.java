package src;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado inicial da TV: " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println(diminuirVolume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        //rodando o método ligar tv
        smartTv.ligar();
        System.out.println("Rodando método smartTv.ligar a TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //rodando o método desligar tv
        smartTv.desligar();
        System.out.println("Rodando método smartTv.ligar a TV desligar: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

    }
}
