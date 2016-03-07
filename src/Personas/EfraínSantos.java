
package Personas;

import ActividadesRecreativas.SquashAndPiscina;


public class EfraínSantos extends Cliente implements SquashAndPiscina {

//Nombre del Hotel a hospedar
private String NombreHotel = "Hotel Intercontinental de Medellin";   
    
//cargo de cliente a hospedar    
public String Cargo = "Presidente de la Empresa Bimbo"; 
    
//variables con el servicio que el cliente desea
public String Servicio2 = "Canchas de Squash"; 

public String Servicio1 = "Servicio Piscina"; 

//Dias a Hospedar 
public String DiasHospedaje = "5"; 

//nombre del cliente
public String Nombre = "Efrain Santos"; 


//constructor    
 public EfraínSantos( ) {
         
 }    
    //**********************************************************
     //Servicio canchas Squash
    //**********************************************************
    @Override
    public String Squash( String Squash ) {    
    
    Squash = Squash + " : Noche ";    
        
    return Squash;        
    //**********************************************************
    }

    
    
    //**********************************************************
    //Servicio pisina
    //*********************************************************
    @Override
    public String Piscina( String Piscina ) { 
    
    Piscina = Piscina + " : Mañana"; 
        
    return Piscina;        
    }
    //**********************************************************

    
    
    
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

    
    //Comentario
    //tome esta clase con el nombre del cliente para tener ordenado y tener variables con respecto, a lo deseado por ejemplo
    //cuando creo el objeto efrainsantos  efra = new efrainsantos( "efrain santos") si no una variable para que tenga un poco de estetica
    //efrainsantos  efra = new efrainsantos( Efra.Nombre )
    
    
}
