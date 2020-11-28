package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String islemler = "İslemler...\n"
                + "1. Kare Alan Hesapla\n"
                + "2. Ucgen Alan Hesapla\n"
                + "3. Daire Alan Hesapla\n"
                + "Cikis: q";
                
        while(true){
            System.out.println(islemler);
            System.out.println("hangi seklin alanini hesaplamak isityorsunuz: ");
            String sekil_turu = sc.nextLine();
            Sekil sekil1 = null;
            if(sekil_turu.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.println("Karenin kenarini giriniz: ");
                int kenar = sc.nextInt();
                sc.nextLine();
                
                sekil1 = new Kare(kenar,"sekil 1");
                sekil1.alan_Hesapla();
            }
            else if(sekil_turu.equals("2")){
                System.out.println("Ucgenin birinci kenarini giriniz: ");
                int k1 = sc.nextInt();
                System.out.println("Ucgenin ikinci kenarini giriniz: ");
                int k2 = sc.nextInt();
                System.out.println("Ucgenin ucuncu kenarini giriniz: ");
                int k3 = sc.nextInt();
                
                sc.nextLine();
                
                sekil1 = new Ucgen(k1, k2, k3, "sekil 2");
                sekil1.alan_Hesapla();
                
            }
            else if(sekil_turu.equals("3")){
                 System.out.println("Dairenin yaricapini giriniz: ");
                 int yari_cap = sc.nextInt();
                 sc.nextLine();
                 
                 sekil1 = new Daire(yari_cap, "sekil 3");
            
            }
            else{
                System.out.println("Hatalı giriş, tekrar denneyiniz...");
                continue;
            }
        }
        
    }
    
}
