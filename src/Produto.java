public class Produto{
    public float valor;
    public String tipo;

    public float valorImposto(){
        float i;
        if(valor < 500){
            i = valor *10/100;
        }else{
            i = valor *15/100;
        }
        return i;
    }
}
