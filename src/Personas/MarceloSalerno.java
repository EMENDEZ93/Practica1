
package Personas;

public class MarceloSalerno extends Cliente{


//Nombre del Hotel a hospedar
private String NombreHotel = "Hotel el Portón de Medellin";   
    
//cargo de cliente a hospedar    
public String Cargo = "Gerente de la Empresa Movistar"; 
    
//Dias a Hospedar 
public String DiasHospedaje = "5"; 

//nombre del cliente
public String Nombre = "Marcelo Salerno"; 


//constructor    
 public MarceloSalerno( ) {
         
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
