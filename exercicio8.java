import java.util.Scanner;

public class exercicio8 {

    public static void main(String[]args){

        double horas;
        double mes;
        

        System.out.println("Digite quanto ganha por mês: ");
        System.out.println("Digite horas trabalhadas: ");
        Scanner scanner = new Scanner(System.in);
        horas = scanner.nextFloat();
        mes = scanner.nextFloat();

        horas = (horas * mes);

        System.out.print("Esse o salario referente ao mês: ");
        System.out.print(horas);
        
    }
    
}
