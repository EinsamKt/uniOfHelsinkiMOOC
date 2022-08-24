/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundrethSeconds;
    
    public Timer() {
        this.hundrethSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance() {
        this.hundrethSeconds.advance();
        
        if (this.hundrethSeconds.value() == 0) {
            this.seconds.advance();
        }
        
        }
        @Override
            public String toString() {
                return seconds + ":" + hundrethSeconds;
    }
    
}
