
package Personas;


public class JulianRoman extends Cliente{

     
//Nombre del Hotel a hospedar
private String NombreHotel = "Hotel los Álamos";   
    
//cargo de cliente a hospedar    
public String Cargo = "Empleado del Municipio de Medellin"; 
    
//Dias a Hospedar 
public String DiasHospedaje = "5"; 

//nombre del cliente
public String Nombre = "Julian Roman"; 


//constructor    
 public JulianRoman( ) {
         
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
