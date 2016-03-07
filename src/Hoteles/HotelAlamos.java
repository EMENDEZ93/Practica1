
package Hoteles;

import GastronomiaTradicional.PlatosBandejaPaisa;
import GastronomiaTradicional.PlatosRegionales;
import practican1.Hotele.Tradicional;


public class HotelAlamos extends Tradicional implements PlatosBandejaPaisa, PlatosRegionales{
    
    //Ubicacion
    public String UbicacionH = "Laureles" ;  
    
    //numero de estrellas del hotel
    public String Estrellas = "3";
    
    //numero de hablitaciones ocupadas
    public int HabitaOcupadas = 35; 
    
    //Precio de la habotacion por dia
    public double PrecioHabita = 80000;
    
    //****************************************
    //plato Tradicional
    public String BandejaPaisa  = "Bandeja Paisa";  
    public double CostoBandejaPaisa  = 15000;
    
    public String FiletesRes = "Filetes de Res" ;  
    public double CostoFiletesRes  = 12000 ;
    
    public String FileteCerdo = "Filete de Cerdo";  
    public double CostoFileteCerdo  = 12000;
    
    public String FiletePollo  = "Filete de Pollo" ;  
    public double CostoFiletePollo  = 36000 ;
    
    //****************************************
    
   
     //Constructor
    public HotelAlamos( String NombreHotel ) {

    super( NombreHotel );    

    
    }
    
    
    //****************************************
    //platos Tradicionales
    @Override
    public String BandejaPaisa( String Plato, double Precio ) {           
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;    
    }

    @Override
    public String FileteCerdo(String Plato, double Precio) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }    
   
    @Override
    public String FiletesRes(String Plato, double Precio) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
        
    }

    @Override
    public String FiletePollo(String Plato, double Precio) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }
        

    
}
