public class AcilServis implements Comparable<AcilServis> {

    private String isim;
    private String sikayet;
    private int oncelik;
    
    /*
    Apendiks 1
    Ateş 2
    Baş Ağrısı 3
    */
    
    public AcilServis(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        
        if(sikayet.equals("apendiks"))
            this.oncelik = 3;
        else if(sikayet.equals("ateş"))
            this.oncelik = 2;
        else if(sikayet.equals("baş ağrısı"))
            this.oncelik = 1;
    }

    @Override
    public String toString() {
        return "Hasta{" + "isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + '}';
    }

    @Override
    public int compareTo(AcilServis once) {
        if(this.oncelik < once.oncelik ){
        return 1;
    }
        else if(this.oncelik > once.oncelik ){
        return -1;
    }
        return 0;
        
    }
    
    
    
}
