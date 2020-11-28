
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static ArrayList<Integer> liste = new ArrayList<>();
    
    public static void dosyaOku(){
        
        FileInputStream file = null;
        
        try {
            file = new FileInputStream("muzic.mp3");
            
            int deger;
            
            while ((deger = file.read()) != -1){
                
                liste.add(deger);
                
            }
            
            
            
            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    
    public static void kopyala(String isim){
        
        
        FileOutputStream file = null;
        
        try {
            file = new FileOutputStream(isim);
            
            for(int i : liste){
                
                file.write(i);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
        
    public static void main(String[] args) {
        
        dosyaOku();
        long baslangic = System.currentTimeMillis();
        kopyala("muzic2.mp3");
        kopyala("muzic3.mp3");
        kopyala("muzic4.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println((bitis - baslangic) / 1000);
        
        
    }
}