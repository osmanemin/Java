
package javaapplication1;


public class Kare extends Sekil {
    
    private int a;

    public Kare(int a, String isim) {
        super(isim);
        this.a = a;
        
    }
    
    

    @Override
    void alan_Hesapla() {
        
        int alan = a * a;
        System.out.println(getIsim() + "' in alanı: " + alan);
    }
    
}
