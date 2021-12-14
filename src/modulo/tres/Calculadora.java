package modulo.tres;

import java.math.BigDecimal;

public class Calculadora {

    public static void main(String[] args) {

        int x = 5, y = 5;

        Operacao operacao = new Adicao();
        System.out.println(operacao.calcular(new BigDecimal(x), new BigDecimal(y)));

    }
}
