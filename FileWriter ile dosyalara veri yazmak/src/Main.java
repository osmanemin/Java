
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        FileWriter writer = null;
        
        try {
            
            writer = new FileWriter("dosya.txt", true);
        
            writer.write("Osman Emmin USTA\nTayyip Erkam Fidan\n");
        
        
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if(writer != null)
                try {
                    writer.close();
            } catch (IOException ex) {
                    System.out.println("Dosya kapanamadı");
            }
        }
        
        
        
}
    
}
