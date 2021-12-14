package modulo.tres;

import java.math.BigDecimal;

public class Divisao implements Operacao {


    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {

        BigDecimal resultado = null;

        if (x == null || y == null){
            resultado = null;
        }
        else{
            resultado = ( y.compareTo( new BigDecimal(0)) == 0? null: x.divide(y, 3, BigDecimal.ROUND_HALF_UP));
        }

        return resultado;
    }
}
