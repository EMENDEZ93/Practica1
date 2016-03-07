 
package practican1.Hotele;


public class Porton extends Hotel{

    //Clase de hotel : Hoteles de lujo
    private String ClassHotel = "Hotel Nacional";

    //habitaciones disponibles por default
    public int HabitacionesDefault = 100;
    
    
    //*************************************************    
    //Constructor
    //*************************************************     
    public Porton( ) {
    
        super( );    
        
    }
    //*************************************************    


    
    
    
    //*************************************************    
    //Constructor + nombre del hotel
    //*************************************************    
    public Porton( String NombreDelHotelP ) {
    
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
