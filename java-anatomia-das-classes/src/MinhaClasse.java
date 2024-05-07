public class MinhaClasse {
    

    public static void main(String[] args){
        System.out.println("sobre variaveis e suas regras");

         //final String BR = "Brasil"; // uma variavel com todas as letras maiusculas nao pode ser alterada
      
        //tipo  nome   valor
        // int _numero = 21; 

            //usando metodos
            String primeiroNome = "Guilherme";
            String segundoNome = "Rodrigues";

            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
            System.out.print(nomeCompleto);

        }
        // metodo tipo  retorno nome
        public static String nomeCompleto(String primeiroNome , String segundoNome){

            return primeiroNome.concat(" ").concat(segundoNome);
        }

}
