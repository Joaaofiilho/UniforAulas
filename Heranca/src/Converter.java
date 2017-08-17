public class Converter{
    public static String paraBase(int base, int dec){
        String numeroBase = "";
        for (int i = dec; i > 0; i /= base) {
            int numeroPadrao = i % base;

            if(numeroPadrao >= 10){
                //65 - 90
                char letraBase = (char)(numeroPadrao + 55);

                numeroBase += letraBase;
            }else{
                numeroBase += Integer.toString(numeroPadrao);
            }
        }

        //Invertendo a String
        StringBuffer numeroBaseAux = new StringBuffer(numeroBase);
        return numeroBaseAux.reverse().toString();
    }
}
