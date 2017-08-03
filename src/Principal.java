import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Produto p = new Produto();

        float preco, imp;
        String tipo;

        System.out.println("Digite o preço do produto: ");
        preco = scan.nextFloat();

        scan.nextLine();

        System.out.println("Digite o tipo do produto: ");
        tipo = scan.nextLine();

        p.valor = preco;
        p.tipo = tipo;

        System.out.println("\nPreço do produto = " +p.valor);
        System.out.println("\nTipo do produto = " + p.tipo);

        imp = p.valorImposto();

        System.out.println("\nImposto = " + imp);
    }
}
