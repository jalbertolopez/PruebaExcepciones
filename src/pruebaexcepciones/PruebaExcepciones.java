
package pruebaexcepciones;

/**
 *
 * @author jalberto
 */
public class PruebaExcepciones {


    public static void main( String[] args ) {
        
        UnaClaseCualquiera unaInstancia = new UnaClaseCualquiera();
       
        for( int i = 0; i < 10; i++ ){                 
            
            try{
               System.out.println( unaInstancia.unMetodo() );
            }
            catch( UnaExcepcion e){
                System.out.println( e.getMessage() );
                System.out.println( "(Puedo imprimir otro mensaje tambien)" );
            }        
        }   
        
    }
    
}
