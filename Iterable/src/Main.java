
public class Main {
    public static void main(String[] args) {
        
        String[] kanallar = {"trt","power fm", "kral", "radyo hacettepe"};
        
        Radyo radyo = new Radyo(kanallar);
        
        for(String s: kanallar)
            System.out.println(s);
    }
}
