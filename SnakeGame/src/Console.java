public class Console {
    private int[][] tela = new int[12][12];
    private boolean fimDoJogo;
    private double timeAtual;
    private double timeLimite;

    public Console() {
        setFimDoJogo(false);
        setTimeAtual(0);
        setTimeLimite(180000); //3 minutos

        for (int i = 0; i < tela.length; i++) {
            for (int j = 0; j < tela.length; j++) {
                tela[i][j] = 0;
            }
        }


    }

    final int timePorSegundo = 100;

    public boolean isFimDoJogo() {
        return fimDoJogo;
    }

    private void setFimDoJogo(boolean fimDoJogo) {
        this.fimDoJogo = fimDoJogo;
    }

    public double getTimeAtual() {
        return timeAtual;
    }

    public void setTimeAtual(double timeAtual) {
        this.timeAtual = timeAtual;
    }

    public void addTimeAtual(double time) {
        this.setTimeLimite(getTimeLimite()- timePorSegundo);
        this.timeAtual += time;
    }

    public double getTimeLimite() {
        return timeLimite;
    }

    private void setTimeLimite(double timeLimite) {
        this.timeLimite = timeLimite;
    }
}
