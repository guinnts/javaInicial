public class AboutMe {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        Double altura = Double.valueOf(args[3]);

        System.out.println("ola meu nome é "+ nome + " " + sobrenome);
        System.out.println("tenho "+ idade + " anos");
        System.out.println("minha altura é "+ altura+ " cm");
        
    }
}
