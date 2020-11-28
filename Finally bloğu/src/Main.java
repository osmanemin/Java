public class Main {

    public static void main(String[] args) {
        
        try{
            
        int a = 30 /0;
        String s = "osman";
        System.out.println(s.hashCode());
        
        }
        catch(NullPointerException e){
            System.out.println("Null referans hatası...");
        }
        finally{// her zmaan çalışır
            System.out.println("burası her zaman çalışır...");
        }
        
            
    }
}
