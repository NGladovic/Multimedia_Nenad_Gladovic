
package media;


public class Television {
    
    private int maxVolume;
    private int currentProgram;
    private boolean isTurnedOn;
    
    public void setMaxVolume(int customeVolume){
        this.maxVolume = customeVolume;
    }
    
    public int getMaxVolume(){
        return this.maxVolume;
    }
    
    public void setCurrentProgram(int customProgram){
        this.currentProgram = customProgram;
    }
    
    public int getCurrentProgram(){
        return this.currentProgram;
    }
    
    public void setisTurnedOn( boolean customeTurnON){
        this.isTurnedOn = customeTurnON;
    }
    
    public boolean getisTurnedOn(){
        return this.isTurnedOn;
    }
    
    public Television(){
        this.currentProgram = 1;
        this.isTurnedOn = false;
        this.maxVolume = 0;
    }
    
    public Television(int program,boolean turnedOn,int customVolume){
        this.currentProgram = program;
        this.isTurnedOn = turnedOn;
        this.maxVolume = customVolume;
    }
    
    public void info(){
        System.out.println("Ukljucen " + this.isTurnedOn);
        System.out.println("Jacina zvuka " + this.maxVolume);
        System.out.println("Na programu br" + this.currentProgram);
        System.out.println("");
    }
}
