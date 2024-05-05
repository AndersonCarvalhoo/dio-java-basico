public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("A tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.mudarCanal(5);
        System.out.println("A tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.desligar();
        System.out.println("A tv ligada? " + smartTv.ligada);
    }
}
