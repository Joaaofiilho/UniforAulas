public class ContaCorrenteSimples extends Conta{
    private String numCartao;
    private String firstNumCheque;
    private String secondNumCheque;

    //No limite No cheque especial


    public ContaCorrenteSimples(String numCartao, String firstNumCheque, String secondNumCheque) {
        this.numCartao = numCartao;
        this.firstNumCheque = firstNumCheque;
        this.secondNumCheque = secondNumCheque;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getFirstNumCheque() {
        return firstNumCheque;
    }

    public void setFirstNumCheque(String firstNumCheque) {
        this.firstNumCheque = firstNumCheque;
    }

    public String getSecondNumCheque() {
        return secondNumCheque;
    }

    public void setSecondNumCheque(String secondNumCheque) {
        this.secondNumCheque = secondNumCheque;
    }
}
