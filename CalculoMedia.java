
import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float num1, num2, num3;
        float media, i, soma = 0;
        
        for(i = 0; i < 3; i++){
            
            System.out.println(" digite seu 1ª numero");
            num1 = ent.nextInt();
            
            System.out.println("digite seu 2ª numero");
            num2 = ent.nextInt();
            
            System.out.println("digite seu 3ª numero");
            num3 = ent.nextInt();
            
            // calcula a média
            media = (num1 + num2 + num3)/3;
            System.out.println("A média é : " + media);
            
            soma = (num1 + num2 + num3);
            System.out.println("A soma é  : " + soma);
            
            
           
        }       
    }
}
