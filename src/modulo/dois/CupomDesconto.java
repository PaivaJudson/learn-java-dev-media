package modulo.dois;

public class CupomDesconto {

    private int cupomValido;

    public boolean validar(int cupomUsuario){
        return cupomValido == cupomUsuario;
    }

    public void setCupomValido(int cupomValido) {
        this.cupomValido = cupomValido;
    }

    //teste de um método nada haver com essa classse

    public boolean noHorario(int minutoAnterior, int minutoAtual){
        return minutoAtual - minutoAnterior <= 15;
    }
}
