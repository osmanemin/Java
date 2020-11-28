
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {        
    
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("dosya.txt");
            FileWriter writer2 = new FileWriter("dosya2.txt")){
            writer.write("asdasda");
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    
}
