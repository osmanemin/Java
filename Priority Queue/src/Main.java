
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
       /* Queue<Integer> kuyruk = new PriorityQueue<Integer>();
        
        kuyruk.offer(5);
        kuyruk.offer(55);
        kuyruk.offer(6);
        kuyruk.offer(32);
        kuyruk.offer(12);
        kuyruk.offer(4);
        kuyruk.offer(25);
        
        while (!kuyruk.isEmpty()) {            
            System.out.println(kuyruk.poll());
        }        
        */
       


        //Örnek: Acil Servis Uygulaması
        
        AcilServis ahmet = new AcilServis("ahmet","ateş");
        AcilServis mehmet = new AcilServis("mehemt","ateş");
        AcilServis ali = new AcilServis("ali","baş ağrısı");
        AcilServis osman = new AcilServis("osman","apendiks");
        
        Queue<AcilServis> kuyruk = new PriorityQueue<AcilServis>();
        
        
        kuyruk.offer(ahmet);
        kuyruk.offer(mehmet);
        kuyruk.offer(ali);
        kuyruk.offer(osman);
        
        while(!kuyruk.isEmpty()){
            System.out.println(kuyruk.poll());
        }
    }
}
