package main;

import media.Television;
import media.Radio;

public class Main {

    
    public static void main(String[] args) {
        
        
        Television panasonic = new Television();
        panasonic.info();
        
        panasonic.setisTurnedOn(true);
        panasonic.setMaxVolume(34);
        panasonic.setCurrentProgram(5);
        panasonic.info();
        
    }
    
}
