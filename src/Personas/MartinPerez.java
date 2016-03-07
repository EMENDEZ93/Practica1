
package Personas;

public class MartinPerez extends Cliente{
    
//Nombre del Hotel a hospedar
private String NombreHotel = "Hotel los Álamos";   
    
//cargo de cliente a hospedar    
public String Cargo = "Empleado de la Gobernación de Antioquia"; 
    
//Dias a Hospedar 
public String DiasHospedaje = "7"; 

//nombre del cliente
public String Nombre = "Martin Perez"; 


//constructor    
 public MartinPerez( ) {
         
 }    
        
    //**********************************************************
    //Encapsulamiento
    //**********************************************************

    public void setNameHotel( String NameHotel ) {
    
        this.NombreHotel = NameHotel;
    
    }
    
    public String getNameHotel() {
    
        return NombreHotel;
    
    }

    //**********************************************************

}
