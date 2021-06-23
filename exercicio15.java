import java.util.Scanner;

public class exercicio15{

public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Informe valor/hora: ");
    double valorHora = sc.nextDouble();

    System.out.print("Informe horas trabalhadas ao mês: ");
    double horas = sc.nextDouble();

    double salarioBruto = valorHora * horas;
    double inss = (salarioBruto / 100) * 8;
    double sindicato = (salarioBruto / 100) * 5;
    double ir = (salarioBruto / 100) * 11;
    double totalDescontos = inss + sindicato + ir;
    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.println("Salario Bruto: " + salarioBruto);
    System.out.println("INSS: " +inss);
    System.out.println("IR: " + ir);
    System.out.println("Total de Descontos: " + totalDescontos);
    System.out.println("Salario Liquido: " + salarioLiquido);

    }
}