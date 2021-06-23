import java.util.Scanner;

public class exercicio9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        float c;

        System.out.println("Informe em Celsius: ");
        c = input.nextFloat();
        System.out.println("A temperatura em fahrenheit: "+((9*c+160)/5));

    }
}
