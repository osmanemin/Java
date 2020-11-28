package com.osmanemin.thread1;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread{

    private String isim;

    @Override
    public void run() {
        
        System.out.println(isim + " çalışmaya başladı");
        
        for (int i = 1; i <= 10; i++) {
            
            try {
                System.out.println(isim + " yazıyor: " + i);
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        System.out.println(isim + " çalışmayı durdurdu");
        
    }

    
    
    
    public Printer(String isim) {
        this.isim = isim;
    }
    
    
    
}
