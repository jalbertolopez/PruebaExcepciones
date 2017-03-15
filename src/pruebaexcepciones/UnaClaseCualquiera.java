
package pruebaexcepciones;

/**
 *
 * @author jalberto
 */

public class UnaClaseCualquiera {
    
    public int unMetodo() throws UnaExcepcion {
        
        int numeroAleatorio = (int) Math.rint( Math.random() );
        
        if( numeroAleatorio == 0 ){
            
            throw new UnaExcepcion( "Salio un cero" );
        }
    
        return numeroAleatorio;
    
    }


}