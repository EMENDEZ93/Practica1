
package practican1.Hotele;

public class Intercontinentales extends Hotel{

    //Clase de hotel : Hoteles de lujo
    private String ClassHotel = "Hotel de Lujo";

    //habitaciones disponibles por default
    public int HabitacionesDefault = 120;
    
    
    //*************************************************    
    //Constructor
    //*************************************************     
    public Intercontinentales( ) {
    
        super( );    
        
    }
    //*************************************************    


    
    
    
    //*************************************************    
    //Constructor + nombre del hotel
    //*************************************************    
    public Intercontinentales( String NombreDelHotelP ) {
    
        super( NombreDelHotelP );    
                
    }
    //*************************************************    
    


    
    //*************************************************    
    //Encapsulamiento para la clase del hotel
    //*************************************************    
    public void setClassHotel( String ClassHotel ) {
      
        this.ClassHotel = ClassHotel;
    
    }

    //permite ver el String 
    public String getClasshotel( ) {
        return ClassHotel;
        
    }
    //*************************************************    

  

    
}
