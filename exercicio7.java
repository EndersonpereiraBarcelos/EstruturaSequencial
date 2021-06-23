import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        double area;
        
       System.out.println("Escreva o valor do quadrado: ");
       Scanner scanner = new Scanner(System.in);    
       area = scanner.nextFloat();
       area = (area * 2);

       System.out.print("O valor do quadrado " + area);  
          
}
}