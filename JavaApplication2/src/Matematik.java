
import java.util.Scanner;

public class Matematik {
    
    private double PI = Math.PI;
    
    
    public class Faktorial{
        
             
            public void faktorial(){
                
                Scanner sc = new Scanner(System.in);
                System.out.println("Lutfen bir sayi giriniz: ");
                int sayi = sc.nextInt();
                int fakt = 1;
                
                for(int i = 2; i <= sayi; i++){
                    
                    fakt *= i;
                    
                    
                }
                
                System.out.println("girilen değerin faktoriyel' i: " + fakt);
            }
            
                 
                
        
        
    }
    
    public class Asal{
        
        public boolean asal_mı(int sayi){
            
            int i = 2;
            
            while(i < sayi){
                
                if(sayi % i == 0){
                    return false;
                }
                
                i++;
                
            }
            
            return true;
            
        }
        
        
    }
    
    
    public class Alan{
        
        public class DaireAlan{
            
            public void dairenin_alanı(int yaricap){
            
            System.out.println("Daire' nin alanı: " + (PI * yaricap * yaricap));

            
            }
            
        }
        
       
        
        
        
        
    }
    
}
