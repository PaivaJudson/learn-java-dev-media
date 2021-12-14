package modulo.tres;

import java.math.BigDecimal;

public class Multiplicacao implements Operacao{

    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {

        BigDecimal resultado = null;

        resultado = (x != null && y != null ? x.multiply(y) : null);

        return resultado;
    }
}
