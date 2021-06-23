import java.util.Scanner;
public class exercicio13 {
    
       public static void main(String[]args){
           
           Scanner sc = new Scanner(System.in);
        
        int alturaH;
        int alturaF;
        
        System.out.println("Homem informe sua altura: ");
       alturaH = sc.nextInt();
       
         System.out.println("Mulher informe sua altura: ");
       alturaF = sc.nextInt();
       
       
       System.out.println("Homem seu peso ideal é: " + ((72.7*alturaH ) - 58));
       
       System.out.println("Mulher seu peso ideal é: " + ((62.1*alturaF) - 44.7));
    }
}