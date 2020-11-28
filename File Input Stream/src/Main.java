
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        FileInputStream bos = null;
        File file = new File("dosya.txt");
/* FileOutputStream fos = null;
            
            
            try {
            fos = new FileOutputStream(file);
            
            } catch (FileNotFoundException ex) {
            System.out.println("HATA: File Not Found Exception...");
            }*/
        try {
            bos = new FileInputStream("dosya.txt");
            
            /*bos.skip(5);
            
            System.out.println("Okunan değer: "
                    + (char)(bos.read()));*/
            int deger;
            String s = "";
            
            while ((deger = bos.read()) != -1){
            
                s += (char) deger;
            }
            
            System.out.println(s);
            
            
                
            /*System.out.println("Okunan karakter: "
                    + (char) (bos.read()));
            System.out.println("Okunan karakter: "
                    + (char) (bos.read()));
            System.out.println("Okunan karakter: "
                    + (char) (bos.read()));*/
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("HATA: File Not Found Exception!!!");
        } catch (IOException ex) {
            System.out.println("Dosya Okunamadı");
        }
        finally{
            try{
                if (bos != null)
                    bos.close();
            }
            catch (IOException ex)
            {
                System.out.println("hata");
            }
        }
    }
}
