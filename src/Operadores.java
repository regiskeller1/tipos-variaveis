public class Operadores {

    public static void main(String[] args) {

       boolean condicao1 = true;
       boolean condicao2 = false;
       boolean condicaoRegis = true;

       if(condicao1 && condicao2) {
           System.out.println("as duas condições são iguais");
       } else{
           System.out.println("as duas condições são diferentes");
       }

       if(condicao1 || condicaoRegis || condicao2) {
           System.out.println("uma das condições são verdadeiras");
       } else {
           System.out.println("nenhuma das condições são verdadeiras");
       }
    }
}
