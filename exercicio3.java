import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[]args){
        int a, b, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

        System.out.println("A soma :" + c);
  
    }
    
}