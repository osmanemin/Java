public class Main {
    public static void main(String[] args) {
        /*
                Hıdır adındaki bir manav karpuzlarını istiflemek istiyor.
                Karpuzlarını isitflerken birinci sırada bir karpuz, ikinci sırada dört, üçüncü sırada dokuz karpuz karpuz olacak şekilde
                (yani her bir sıra kendi numarasının karesi kadar karpuz içericek) istiflemek istiyor.
                karpuzlarının toplam sayısı da bir sayının karesidir.
                Hıdır Beyin kaç karpuzu vardır? Satırların sayısı kaçtır?
                    (Not: Karpuzların sayısı 10000' den az)
         */
        int x = 1;
        int toplam = 0;
        while (true){
            if (Math.sqrt(toplam)%1 == 0 && toplam != 0 && toplam != 1){
                break;
            }
            toplam = toplam + (x*x);
            x++;
        }
        System.out.printf("Karpuz sayisi: " + toplam + "\nKat sayisi: " + (x-1));
    }
}
