package estruturas_excepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
//        Number valor = Double.valueOf("a1.75"); // Runtime Exception
//        Number valor = NumberFormat.getInstance().parse("a1.75"); // Exception(O erro precisa ser tratado imediatamente)


        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
