
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay minuto;
    private NumberDisplay hora;
    private String horaActual;
    

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
       minuto = new NumberDisplay(60);
       hora = new NumberDisplay(24);
       minuto.setValue(00);
       hora.setValue(00);
       horaActual = "00:00 am";
    }

    
      /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay(int minutos, int horas)
    {
       
       minuto = new NumberDisplay(60);
       hora = new NumberDisplay(24);
       minuto.setValue(minutos);
       hora.setValue(horas);
       if (hora.getValue() >=0 & hora.getValue() < 13 )
       {
           horaActual = hora.getDisplayValue() + ":" + minuto.getDisplayValue() + "am";
       }
       else
       {
           horaActual = hora.getDisplayValue() + ":" + minuto.getDisplayValue() + "pm";
       }
    }
    
    
    public void setTime(int horas,int minutos)
    {
     horaActual = horas + ":" + minutos;
     hora.setValue(horas);
     minuto.setValue(minutos);
     
    }
    
    
    public String getTime()
    {
     String stHora = "";
     stHora = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
     return stHora;
    }
    
    public void timeTick()
    {
     minuto.setIncrement();
     if (minuto.getValue() == 0)
     {
         hora.setIncrement();
     }
     horaActual = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }
    
    
    
    }
    