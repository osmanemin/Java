
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner (new BufferedReader(new FileReader("dosya.txt")))){
            
            while(scanner.hasNextLine()){
                
                String ogrenci_bilgsi = scanner.nextLine();
                
                String[] dizi = ogrenci_bilgsi.split(",");
                
                if(dizi[1].equals("Bilgisayar Mühendisliği")){
                    System.out.println(ogrenci_bilgsi);
                    
                }
                
                
                
            }
            
            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}