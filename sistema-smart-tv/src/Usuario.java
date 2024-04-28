public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();

        System.out.println("Ligada -> " + smartTv.ligada);
        System.out.println("Canal -> " + smartTv.canal);
        System.out.println("Volume -> " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status:");
        System.out.println("Ligada -> " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume -> " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume -> " + smartTv.volume);

    }
}
