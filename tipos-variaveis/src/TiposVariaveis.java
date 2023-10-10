public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // precisa ser feito Cast para que a compilação dê certo
        // O Cast é uma maneira de dizer que estamos cientes de que o novo tipo é menos preciso do que
        // o tipo original

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // não pode ser alterado
    }
}