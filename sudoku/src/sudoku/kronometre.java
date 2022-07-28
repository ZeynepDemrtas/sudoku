/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Zeynep
 */
public class kronometre {
    int saniye_sayac;
    
    Timer sayac = new Timer();
    TimerTask gorev = new TimerTask() {
        @Override 
        public void run(){
            saniye_sayac ++;
        }
    };
    public void basla(){
        saniye_sayac = 0;
        sayac.scheduleAtFixedRate(gorev,1000,1000);
    }
    
    public int bitir(){
        int sonuc;
        sonuc = saniye_sayac;
        saniye_sayac = 0;
        return sonuc;
    }
}
