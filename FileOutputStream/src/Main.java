
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
   
        FileOutputStream file = null;
        
        File file1 = new File("deneme.txt");
        
        try {
            file = new FileOutputStream(file1, true);
            System.out.println("Dosya açılıyor..");
            //file.write(61);
            //file.write(31);
            
            //byte[] array = {12,49,87,27};
            String s = "osman emin";
            byte[] s_array = s.getBytes();
            
            file.write(s_array);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("HATA !!! dosya açılamadı");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken hata oluştu...");
        }
        
        finally{
            
            try {
                file.close();
                System.out.println("Dosya kapanıyor...");
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
            
        }
    
    }
    
}
