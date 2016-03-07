
package Hoteles;

import ActividadesRecreativas.ActividadesRecreativas;
import ActividadesRecreativas.SquashAndPiscina;
import GastronomiaTradicional.PlastosTradicionalesP;
import GastronomiaInternacional.PlatoItalianoRizotto;
import GastronomiaInternacional.PlatosItalianosPorton;
import GastronomiaTradicional.PlatosBandejaPaisa;
import practican1.Hotele.Porton;


public class HotelPortonMedellin extends Porton implements SquashAndPiscina, PlatoItalianoRizotto, PlatosItalianosPorton, PlastosTradicionalesP, ActividadesRecreativas, PlatosBandejaPaisa {
   //Ubicacion
    public String UbicacionH = "Poblado" ;  
    
    //numero de estrellas del hotel
    public String Estrellas = "5";
    
    //numero de hablitaciones ocupadas
    public int HabitaOcupadas = 50; 
    
    //Precio de la habotacion por dia
    public double PrecioHabita = 200000;

    
    //****************************************
    //plato italiano
    public String Rizzotto = "Rizzoto";  
    public double CostoRizzoto = 40000;
    
    public String PastasCarbonara  = "Pastas Carbonara " ;  
    public double CostoPastasCarbonara  = 32000 ;
    
    public String PastasLassar  = "Pastas Lassar " ;  
    public double CostoPastasLassar  = 32000 ;
    //****************************************

    //****************************************
    //plato Tradicionales
    public String Churrasco = "Churrasco";  
    public double CostoChurrasco = 30000;
    
    public String Ajiaco = "Ajiaco" ;  
    public double CostoAjiaco = 25000 ;
    
    public String BandejaPaisa  = "Bandeja Paisa" ;  
    public double CostoBandejaPaisa  = 25000 ;
    //****************************************
         

    //****************************************
    //Servicio Recreativo
    //servico de gimnacio    
    public String Gimnasio = "Servicio de Gimnasio";
 
    //servicio de Spa
    public String Spa = "Servicio de Spa";

    //servicio de Squash
    public String Squash = "Canchas de Squash";
        
    //servicio de Piscina
    public String Piscina = "Servicio de  Piscina";

    //****************************************

   
     //Constructor
    public HotelPortonMedellin( String NombreHotel ) {

    super( NombreHotel );    

    }
    
    
    //****************************************
    //platos italianos
    @Override
    public String Rizzoto( String Plato, double Precio ) {           
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;    
    }

   // @Override
    public String PastasCarbonara( String Plato, double Precio ) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }    
    
    // @Override
    public String PastaLassar( String Plato, double Precio ) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    } 
    //****************************************

    
    
    //****************************************
    //platos tradicionales
    @Override
    public String Churrasco( String Plato, double Precio ) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
        
    }

    @Override
    public String Ajiaco( String Plato, double Precio ) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }

    @Override
    public String BandejaPaisa( String Plato, double Precio ) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;        
    
    }
    //****************************************
  
    
    
    //****************************************
    //Actividades recreativas
    //Servicio Gimnasio
    @Override
    public String Gimnasio( String Gimnasio ) {
    return Gimnasio;    
    }

    //servico Spa
    @Override
    public String Spa( String Spa ) {
    return Spa;    
    }

    //Servicio canchas Squash
    @Override
    public String Squash( String Squash ) {    
    return Squash;        
    }

    //Servicio pisina
    @Override
    public String Piscina( String Piscina ) { 
    return Piscina;        
   }
    
    //****************************************
    


    
}
