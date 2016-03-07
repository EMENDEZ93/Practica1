
package practican1.Hotele;

public class Hotel {

  //nombre del Hotel  
  private String NameHotel  ;

  //ubicacion 
  String UbicacionHotel;
  
  //numero de estrellas
  String Nstart;
  
  //numero de habitaciones disponibles
  int DisponiblesHabitaciones;
   //constructor
    public Hotel() {
        
    }
    
//*************************************************    
 //constructor + parametros
//*************************************************    
    public Hotel( String NameHotel ) {
        NameHotel = NameHotel;
  
    }
//*************************************************
    
    
//*************************************************
  //Encapsulamiento para el nombre
//*************************************************    
    public void setNameHotel( String NameHotel ) {
      
        this.NameHotel = NameHotel;
    
    }

    //permite ver el String 
    public String getNamehotel( ) {
        return NameHotel;
        
    }  
//*************************************************



//*************************************************    
 //metodo para ubicacion 
//*************************************************    
    public String Ubicacion( String Ubicacion ){
    
    this.UbicacionHotel = Ubicacion ;

    Ubicacion = "Ubicacion : " +UbicacionHotel;    
    
    return Ubicacion;
    
    }   
//*************************************************


//*************************************************    
 //metodo para numero de estrellas
//*************************************************    
    public String Nstart( String NumeroEstrellas ){
        
    this.Nstart = "Hotel " + NumeroEstrellas + " Estrellas";    
    
    return Nstart;
    
    }   
//*************************************************
    

//*************************************************    
 //metodo para numero de eHabitaciopnes disponibles
//*************************************************    
    public int DispHabitaciones( int habitacionesDefaul , int HabitacionesOcupadas ){
    
    this.DisponiblesHabitaciones = habitacionesDefaul - HabitacionesOcupadas ;
    
    return DisponiblesHabitaciones; 
    
    }   
//*************************************************
   

    
}
