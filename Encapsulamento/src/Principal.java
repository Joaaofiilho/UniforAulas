import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float preco, imp;
        String tipo;
        
        System.out.print("Digite o preco do produto: ");
        preco = scan.nextFloat();

        scan.nextLine();

        System.out.print("Digite o tipo do produto: ");
        tipo = scan.nextLine();
        
        Produto p = new Produto(preco, tipo);

        System.out.printf("Preco do produto = %.2f\n", p.valor);
        System.out.printf("Tipo do produto = %s\n", p.tipo);

        imp = p.valorImposto();

        System.out.printf("Imposto = %.2f", imp);
    }
}
