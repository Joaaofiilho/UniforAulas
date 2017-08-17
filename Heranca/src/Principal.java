import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número decimal: ");
        int dec = sc.nextInt();

        System.out.printf("Digite a base para converter (Max: 35, Min: 2): ");
        int base = 0;
        do{
            base = sc.nextInt();
            if(base >= 36){
                System.out.println("Máximo de 35! Digite novamente.");
            }else if(base < 2){
                System.out.println("Mínimo de 2! Digite novamente.");
            }
        }while(base >= 36 || base < 2);

        System.out.println("Decimal: " + dec);
        System.out.println("Base " + base + ": " + Converter.paraBase(base, dec));
    }
}
