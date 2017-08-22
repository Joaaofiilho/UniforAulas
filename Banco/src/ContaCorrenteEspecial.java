public class ContaCorrenteEspecial extends ContaCorrenteSimples {
    private double limiteCartao;
    private double juros;

    public ContaCorrenteEspecial(String numCartao, String firstNumCheque, String secondNumCheque, double limiteCartao, double juros) {
        super(numCartao, firstNumCheque, secondNumCheque);
        this.limiteCartao = limiteCartao;
        this.juros = juros;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
