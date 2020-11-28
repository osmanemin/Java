public class Main {
    
    public static void main(String[] args) {
   
        //int a = 30 / 0;
        
       // int[] a = {1,2,3,4,5,6};
        
        
        //System.out.println(a[10]);
        
        try {
            
        int b = 30 / 0; // Aritmetic Exception
        } 
        
        catch(ArithmeticException e){
            System.out.println("bir sayı sıfıra bölünemez");
        }
        System.out.println("Burası çalışıyor ");
        try{
            int[] a = {1,2,3};
            System.out.println(a[5]);
        
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array in boyutunun aştınız");
        }
        System.out.println("Burası çalışıyor ");
        
    
    
    
    
    
    
    
    
    
    }
    
}
