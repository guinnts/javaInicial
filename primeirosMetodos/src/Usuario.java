public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();
        System.out.println("tv ligada? "+ tv.ligada);
        System.out.println("esta em qual canal: "+ tv.canal);
        System.out.println("qual o volume da tv: "+ tv.volume);
        tv.tvLigada();
        System.out.println("tv ligada? "+ tv.ligada);
        tv.tvAumentarVolume();
        tv.tvAumentarVolume();
        tv.tvAumentarVolume();
        tv.tvAumentarVolume();
        System.out.println("qual o volume da tv: "+ tv.volume);
        tv.mudarcanal(7);
        System.out.println("esta em qual canal: "+ tv.canal);
    }
}
