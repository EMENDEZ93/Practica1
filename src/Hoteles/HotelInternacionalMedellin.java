
package Hoteles;

import ActividadesRecreativas.ActividadesRecreativas;
import ActividadesRecreativas.SquashAndPiscina;
import GastronomiaInternacional.PlastosAsiaticos;
import GastronomiaInternacional.PlastosItalianos;
import GastronomiaInternacional.PlatoItalianoRizotto;
import GastronomiaInternacional.PlatosPeruanos;
import Vip.Vip;
import practican1.Hotele.Intercontinentales;


public class HotelInternacionalMedellin extends Intercontinentales implements SquashAndPiscina, PlastosItalianos, PlastosAsiaticos, PlatosPeruanos, Vip,ActividadesRecreativas, PlatoItalianoRizotto{

    //Ubicacion
    public String UbicacionH = "Poblado" ;  
    
    //numero de estrellas del hotel
    public String Estrellas = "5";
    
    //numero de hablitaciones ocupadas
    public int HabitaOcupadas = 100; 
    
    //Precio de la habotacion por dia
    public double PrecioHabita = 250000;
    
    //****************************************
    //plato italiano
    public String Rizzotto = "Rizzoto";  
    public double CostoRizzoto = 40000;
    
    public String PastasBoloñesa = "Pastas Boloñesa" ;  
    public double CostoPastasBoloñesa = 35000 ;
    //****************************************

    //****************************************
    //plato peruano
    public String PolloBrasa = "Pollo a la Brasa";  
    public double CostoPolloBrasa = 45000;
    
    public String Chifa = "Chifa" ;  
    public double CostoChifa = 36000 ;
    
    public String Pescado = "Pescado" ;  
    public double CostoPescado = 40000 ;
    //****************************************

    
    //****************************************
    //plato Asiatico
    public String Bibimbap = "Bibimbap";  
    public double CostoBibimbap = 65000;
    
    public String Sukiyaki = "Sukiyaki" ;  
    public double CostoSukiyaki= 85000 ;
    //****************************************

    
    //****************************************
    //Servicio Vip
    public String Transporte = "Servicio de Transporte";    
    public String Tour = "Tour por la Ciudad";
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
  //  public HotelInternacionalMedellin() {
  //  super();    
  //  }

   
     //Constructor
    public HotelInternacionalMedellin( String NombreHotel ) {

    super( NombreHotel );    

    
    }
    
    
    //****************************************
    //platos italianos
    @Override
    public String Rizzoto(String Plato, double Precio) {           
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;    
    }

    @Override
    public String PastaBoloñesa(String Plato, double Precio) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }    
    //****************************************

    
    
    //****************************************
    //platos peruanos
    @Override
    public String PolloBrasa(String Plato, double Precio) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
        
    }

    @Override
    public String Chifa(String Plato, double Precio) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }

    //platos peruanos
    @Override
    public String Pescado(String Plato, double Precio) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;        
    
    }
    //****************************************

    
    
    //****************************************
    //platos asiaticos
    @Override
    public String Bibimbap(String Plato, double Precio) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;   
    }
    
    @Override
    public String Sukiyaki(String Plato, double Precio) {

    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }    
    //****************************************



    
    //****************************************
    //servicio Vip
       @Override
    public String Transporte( String Transporte) {

    Transporte = Transporte;    
        
    return Transporte;
    
    }

    @Override
    public String Tour( String Tour) {

    Tour = Tour;    
        
    return Tour;    
        
    }
    //****************************************

    
    
    //****************************************
    //Actividades recreativas
    //Servicio Gimnasio
    @Override
    public String Gimnasio(String Gimnasio) {
    return Gimnasio;    
    }

    //servico Spa
    @Override
    public String Spa(String Spa) {
    return Spa;    
    }

    //Servicio canchas Squash
    @Override
    public String Squash(String Squash) {    
    return Squash;        
    }

    //Servicio pisina
    @Override
    public String Piscina(String Piscina) { 
    return Piscina;        
    }
    
    //****************************************
    
    
    
}
