import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello world!");

        Date teste1 = new Date();

        System.out.print(teste1.toString());

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
            System.out.print("Maior de idade");
        } else {
            System.out.print("Menor de idade");
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