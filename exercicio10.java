import java.util.Scanner;

public class exercicio10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        float f;


        System.out.println("Informe em fahrenheit: ");
        f = input.nextFloat();

        System.out.println("A temperatura em celsius: "+((f-32)/9));
    }
}
