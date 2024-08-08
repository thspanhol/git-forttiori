import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Infome seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Informe sua idade:");
        int idade = teclado.nextInt();
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
    }
}
