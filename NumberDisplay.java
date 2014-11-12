
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    private int totalLimitDisplay;
    
    
    /**
     * Constructor al cual se le itnroduce el limite del display y hace que el display se ponga a 0
     */
    public NumberDisplay(int limitDisplay)
    {
      display = 0;
      totalLimitDisplay = limitDisplay;
    }

   /**
    * Metodo setter que hace que el valor display se modifique por el introducido
    */
   public void setValue(int actualDisplay)
   {
       display = actualDisplay;
       
   }
   
   /**
    * Método que devuelve el valor actual del display en forma de cadena de 2 caracteres
    */
   public String getDisplayValue()
   {
       String stringDisplayValue;   
            if(display < 10 & display >= 0)
       {
           stringDisplayValue = "0" + display ;
       }
       else
       {
           stringDisplayValue = "" + display ;
       }
       return stringDisplayValue;   
   }
   
   /**
    * Método que devuelve el valor actual del display como entero 
    */
   public int getValue()
   {
       int intDisplay;
       intDisplay = display;
       return intDisplay; 
   }
   
   /**
    * Método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite
    */
   public void increment()
   {
       if(display < totalLimitDisplay)
       {
           display+=1;
       }
       else
       {
        display = 0; 
       }
   }
}
