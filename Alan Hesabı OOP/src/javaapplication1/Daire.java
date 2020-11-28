
package javaapplication1;

public class Daire extends Sekil {

    private int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }
    
    
        
    @Override
    void alan_Hesapla() {
        System.out.println(getIsim() + "' nin alanı: " + (Math.PI * yaricap * yaricap));
    }
    
    
    
}
