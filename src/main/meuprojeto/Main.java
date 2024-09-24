package meuprojeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        CorpoHumano c1 = new CorpoHumano(0,0,0,0);

        System.out.print("Digite a massa: ");
        c1.setMassa(input.nextFloat()); // Se esta linha fosse substituida por "c1.massa = '2'; ocorreria um erro por conta do valor da variável ser string ao inves de float

        System.out.print("Digite a altura: ");
        c1.setAltura(input.nextFloat());

        float imc = c1.getMassa() / (c1.getAltura() * c1.getAltura());

        text(imc, c1.getMassa(), c1.getAltura());
    }

    public static void text(float imc, float massa, float altura) {
        System.out.println("");
        System.out.println("""
        -------------- Cálculo de IMC --------------""");
        System.out.println("""
            Massa: """ + massa);
        System.out.println("""
            Altura: """ + altura);
        System.out.println("""
            IMC: """ + imc);
        System.out.println("""
        --------------------------------------------
        """);
    }
}