import java.util.Scanner;

public class exercicio4{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua primeira nota bimestal: ");
            double nota1 = sc.nextDouble();

        System.out.print("informe sua segunda nota Bimestral: ");
            double nota2 = sc.nextDouble();
        
        System.out.print("Informe sua terceira nota Bimestral: ");
            double nota3 = sc.nextDouble();
        
        System.out.print("Informe sua quarta nota bimestral: ");
            double nota4 = sc.nextDouble();

        double calc = (nota1 + nota2 + nota3 + nota4) / 2;

        System.out.print("Essa foi a somas das notas " + calc);

    }
}