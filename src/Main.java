import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Date teste1 = new Date();

        System.out.println(teste1.toString());

        System.out.println(Operacoes.contador(3,7));

        // tipo nome = valor;
        int idade = 27;
        var nome = "Thales";

        // byte, short, int, long
        boolean eBrasileiro = true;
        char letra = 'T';

        // String NÃO é um tipo primitivo, é uma classe.
        String sobreNome = "Spanhol";

        // double é mais preciso mas também usa mais memória.
        float floatNumero = 1.1234567f;
        double doubleNumero = 1.123456789012345;

        // Condicionais if e ternário
        if(idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        char nota2 = 'B';
        switch (nota2) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            case 'F':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }

        int numero = 7;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);

        // Array
        String[] cores = {"Vermelho", "Verde", "Azul"};
        cores[2] = "Branco";
        System.out.println(cores.length + " cores informadas.");

        int[] listaIdades = new int[7];

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Nome1");
        listaNomes.add("Nome2");
        listaNomes.add("Nome3");
        listaNomes.remove(1);
        listaNomes.get(1);
        listaNomes.size();

        // Loop
        int indice = 1;
        for (int i = indice; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        while(indice < 3){
            System.out.println("While print");
            indice++;
        }

        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Deseja contitnuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos valores é " + s);

        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for(double valor: v){
            System.out.print(valor + " ");
        }

        // Casting
        int nota = 9;
        double notaDecimal = nota;

        nota = (int) notaDecimal - 1 ;

        char letraX = 'C';
        String palavra = String.valueOf(letraX);
        letraX = nome.charAt(1);

        String stringNumero = "147";
        int numerostring = Integer.parseInt(stringNumero);

    }
}