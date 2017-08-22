public class ContaPoupanca extends ContaCorrenteSimples{
    public String data;

    public ContaPoupanca(String numCartao, String firstNumCheque, String secondNumCheque, String data) {
        super(numCartao, firstNumCheque, secondNumCheque);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
