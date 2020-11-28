public class Main{

    public static void main(String[] args) {

        /*
            Mehmet Bey 1 milyon liralık emeklilik parasını bakaya yatırarak faiziyle geçinmeyi düşünmektedir.
            Bankanın üç alternatifi vardır:
            yılllık faiz %52, altı aylık faiz %48 ve üç aylık faiz +42. her üçalternatifde de
            Mehmet Bey parasını yıl sonuna ladar çakmemeye kararlı olduğuna göre;
            hangi türde hesap açtırmasının daha avantajlı olduğunu bulacak bir program yazınız.
         */

        int para = 1000000;

        int yillik_faiz;
        int alti_aylik_faiz;
        int uc_aylik_faiz;

        // yıllık faiz formülü: A*n*t/100

        // aylık faiz formülü: A*n*t/1200

        yillik_faiz = para + (para * 52 / 100);
        int a = (para +  (para * 48 * 6 / 1200));
        alti_aylik_faiz = (para +  (para * 48 * 6 / 1200))+  (a * 48 * 6 / 1200);
        int b = para +  (para * 42 * 4 / 1200);
        uc_aylik_faiz = (para +  (para * 42 * 3 / 1200)) + (b * 42 * 3 / 1200);
        uc_aylik_faiz = uc_aylik_faiz + (uc_aylik_faiz * 42 * 3 / 1200);
        uc_aylik_faiz = uc_aylik_faiz + (uc_aylik_faiz * 42 * 3 / 1200);

        if (yillik_faiz > alti_aylik_faiz && yillik_faiz > uc_aylik_faiz)
            System.out.printf("yıllık faiz en karlı olanıdır ve bir yılın sonunda elde edilen paranın miktarı: " + yillik_faiz );
        else if (alti_aylik_faiz > yillik_faiz && alti_aylik_faiz > uc_aylik_faiz)
            System.out.printf("altı aylık faiz en karlı orandır ve bir yılın sonunda elde edilen paranın miktarı: " + alti_aylik_faiz);
        else
            System.out.printf("uc aylık faiz en karlı olanıdır ve bir yılın sonunda elde dedilen parnın miktarı: " + uc_aylik_faiz);

        System.out.printf("\n\n" +
                "yllik faiz: " + yillik_faiz
        + "\nalti aylik faiz: " + alti_aylik_faiz + "\nuc aylik faiz: " + uc_aylik_faiz);
    }
}