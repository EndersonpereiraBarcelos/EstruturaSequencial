import java.util.Scanner;

public class exercicio12{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
           
        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7*altura) - 58;

        System.out.println("O peso ideal é " + pesoIdeal);


    }
}