package modulo.dois;

public class Main {

    public static void main(String[] args) {



    }

    public static  void switchCase(){

        int x = 1;
        switch(x){

            case 1:{
                System.out.println("Caso 1 a");
                System.out.println("Caso 1 b");
                break;
            }
            case 2:
                System.out.println("Caso 2");
                break;
            default:
                System.out.println("Caso default");
                break;
        }
    }

    public static void ifElse(){
        int numeroDias = 16;
        System.out.println((numeroDias <= 15)? "Primeira Quizena" : "Segunda Quinzena");

    }

    public static void desafios(){

        CupomDesconto cupomDesconto = new CupomDesconto();
        cupomDesconto.setCupomValido(123);
        System.out.println(cupomDesconto.validar(123));

        System.out.println(cupomDesconto.noHorario(30, 15));

        int a = 0, b = 0;

        System.out.println(++a + b++);
    }


    public static void incremento(){
        int juros = 10;
        int selic = 11;

        boolean maiorOuIgual = juros >= selic;
        boolean igualA = juros == selic;

        System.out.println(igualA);

        int desafioUm = 5;
        System.out.println(desafioUm += ++desafioUm);

        int desafioDois = 5;
        System.out.println(desafioDois += desafioDois++);

    }

    public static void variaveis(){

        final float pi = 3.146F;
        final double e;

        e = 1.234e2;

        String nome = "Estevão Dias";
        String dataAniversario = "23/05/2000";

        int lote = 354556;
        boolean aprovado;

        aprovado = true;

        System.out.println(pi);
        System.out.println(e);
        System.out.println(nome);
        System.out.println(dataAniversario);
        System.out.println(lote);
        System.out.println(aprovado);

    }

}
