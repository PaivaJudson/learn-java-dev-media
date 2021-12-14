package modulo.tres;

import java.math.BigDecimal;

public class Adicao implements Operacao {


    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {
        BigDecimal resultado;

        resultado = (x != null && y != null ? x.add(y) : null);
        return resultado;
    }
}
