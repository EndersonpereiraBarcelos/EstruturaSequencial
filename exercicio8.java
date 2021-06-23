import java.util.Scanner;

public class exercicio8 {

    public static void main(String[]args){

        System.out.println("Digite quanto ganha por mês: ");
        System.out.println("Digite horas trabalhadas: ");
        Scanner sc = new Scanner(System.in);
        double horas = sc.nextFloat();
        double mes = sc.nextFloat();

        horas = (horas * mes);

        System.out.print("Esse o salario referente ao mês: ");
        System.out.print(horas);
        
    }
    
}
