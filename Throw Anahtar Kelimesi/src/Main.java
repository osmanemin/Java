
import java.util.Scanner;

public class Main {
    
    
    public static void yas_kontrol(int yas) throws InvalideAgeException{
        
        if(yas <18){
            throw new InvalideAgeException("hatalı yaş");
        }
        else
            System.out.println("Sisteme giriş başarılı");
            
        
        
    }
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        int yas = scanner.nextInt();
        try{
        yas_kontrol(yas);
        }
        catch(InvalideAgeException e){
            e.printStackTrace();
//System.out.println("Yaşınız 18 den küçük olduğunuz için giremezsiniz...");
        }
        
        
       
        
}

    
}
