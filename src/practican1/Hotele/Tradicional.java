
package practican1.Hotele;

public class Tradicional extends Hotel {
    
    //Clase de hotel : Hoteles de lujo
    private String ClassHotel = "Hotel Tradicional";

    //habitaciones disponibles por default
    public int HabitacionesDefault = 40;
    
    
    //*************************************************    
    //Constructor
    //*************************************************     
    public Tradicional( ) {
    
        super( );    
        
    }
    //*************************************************    


    
    
    
    //*************************************************    
    //Constructor + nombre del hotel
    //*************************************************    
    public Tradicional( String NombreDelHotelP ) {
    
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
