
package Hoteles;

import GastronomiaTradicional.PlatosBandejaPaisa;
import GastronomiaTradicional.PlatosTradicionalCon;
import practican1.Hotele.Tradicional;


public class HotelContinental extends Tradicional implements PlatosBandejaPaisa, PlatosTradicionalCon {

    //Ubicacion
    public String UbicacionH = "Envigado" ;  
    
    //numero de estrellas del hotel
    public String Estrellas = "3";
    
    //numero de hablitaciones ocupadas
    int Default = 20; //habitaciones default de este hotel
    
    //defaul + habitaciones ocupadas ...se pareja ya que la clase de hoteles tradicionales el dafeult de habitaciones esta por 40
    public int HabitaOcupadas = Default + 20; 
    
    //Precio de la habotacion por dia
    public double PrecioHabita = 50000;
    
    //****************************************
    //plato Tradicional
    public String BandejaPaisa  = "Bandeja Paisa";  
    public double CostoBandejaPaisa  = 12000;
    
    public String Mondongo = "Mondongo" ;  
    public double CostoMondongo  = 12000 ;
    
    public String Sancocho = "Sancocho";  
    public double CostoSancocho = 12000;
    
    public String Pescado = "Pescado" ;  
    public double CostoPescado
            = 15000 ;
    
    //****************************************
    
   
     //Constructor
    public HotelContinental( String NombreHotel ) {

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
    public String Mondongo( String Plato, double Precio ) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }    
   
    @Override
    public String Sancocho( String Plato, double Precio ) {
        
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
        
    }

    //pescado comida tradicional y no pescado peruano
    @Override
    public String Pescado( String Plato, double Precio ) {
    
    Plato = Plato + " : $ " + Precio;
        
    return Plato;
    
    }
    
}
