
import java.util.ArrayList;

public class Main {
    public static ArrayList <String> processList = new ArrayList<String>();
    public static String process="56+5*3-2";
    public static String number="";
    public static int sonucc;
    public static void main(String[] args) {
        toList();
        System.out.println(processList.get(2));
        processList.remove(2);
        System.out.println(processList.get(2));
        /*islemyap();
        System.out.println(sonucc);*/
        processList.clear();
        //System.out.println(processList.get(2));
        
        
    }
    public static void toList(){
        for (int i=0 ; i < process.length() ; i++){
            if(process.charAt(i)=='+' || process.charAt(i)=='-' ||process.charAt(i)=='/' ||process.charAt(i)=='*')          // + - * / ise bir sonraki karaktere geç
            {
                processList.add(number);
                processList.add(Character.toString(process.charAt(i)));
                number="";
            }
            else{
                number=number+process.charAt(i);
            }
        }
        processList.add(number);
    }
    public static void islemyap(){

        int sayi1, sayi2, sonuc = 0;
        String snc = "null";
        for (int i = 0; i < processList.size(); i++){
            if (processList.get(i).equals("*")){
                sayi1 = Integer.parseInt(processList.get(i-1));
                sayi2 = Integer.parseInt(processList.get(i + 1));
                sonuc = sayi1 * sayi2;
                snc = String.valueOf(sonuc);
                processList.set(i-1, snc);
                processList.remove(i+1);
                processList.remove(i);
                i = i-1;
            }
            else if (processList.get(i).equals("/")){
                sayi1 = Integer.parseInt(processList.get(i-1));
                sayi2 = Integer.parseInt(processList.get(i + 1));
                sonuc = sayi1 / sayi2;
                snc = String.valueOf(sonuc);
                processList.set(i-1, snc);
                processList.remove(i+1);
                processList.remove(i);
                i = i-1;
            }
        }
        for (int i = 0; i < processList.size(); i++){
            if (processList.get(i).equals("+")){
                sayi1 = Integer.parseInt(processList.get(i-1));
                sayi2 = Integer.parseInt(processList.get(i + 1));
                sonuc = sayi1 + sayi2;
                snc = String.valueOf(sonuc);
                processList.set(i-1, snc);
                processList.remove(i+1);
                processList.remove(i);
                i = i-1;
            }
            else if (processList.get(i).equals("-")){
                sayi1 = Integer.parseInt(processList.get(i-1));
                sayi2 = Integer.parseInt(processList.get(i + 1));
                sonuc = sayi1 - sayi2;
                snc = String.valueOf(sonuc);
                processList.set(i-1, snc);
                processList.remove(i+1);
                processList.remove(i);
                i = i-1;

            }
        }
       
        //resultSc.setText(snc);
        sonucc = sonuc; 


    }
}
