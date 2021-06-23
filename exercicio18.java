import java.util.Scanner;
public class exercicio18 {
    
    public static void main(String[]args){
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArquivo = sc.nextDouble();
        
        System.out.print("Digite a velocidade da internet: ");
        double velInternet = sc.nextDouble();
        
        double tempo = tamArquivo / velInternet;
        
        System.out.println("o tempo de download " + tempo);
     
    }  
}