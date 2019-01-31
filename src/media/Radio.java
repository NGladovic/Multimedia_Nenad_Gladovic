
package media;


public class Radio {
    
    private double fmFrequency = 91.8;
    private double amFrequency = 600;
    private String band; 
    
            
   public void setFmFrequency(int cusmtomFmFrequency){
       this.fmFrequency = cusmtomFmFrequency;
   }
   
   public double getFmFrequency(){
       return this.fmFrequency;
   }
   
   public void setAmFrequency(double customAmFrequency){
       this.amFrequency = customAmFrequency;
   }
   
   public double getAmFrequency(){
       return this.fmFrequency;
   }
   
   
}
