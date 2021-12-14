package modulo.tres;

import java.math.BigDecimal;

public class Subtracao implements Operacao{

    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {

        BigDecimal resultado = null;

        resultado = (x != null && y != null? x.subtract(y) : null);

        return resultado;
    }
}
