public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual volume atual: " + smartTv.volume);

        System.out.println("Qual canal atual: " + smartTv.canal);
        smartTv.mudarCanal(5);
        System.out.println("Canal atual depois da mudança: " + smartTv.canal);

        System.out.println("A TV está Ligada ? " + smartTv.ligada);
        System.out.println("Qual volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> A TV está Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A TV está Ligada ? " + smartTv.ligada);

    }
}