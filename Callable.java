/**
 * Interfaz Callable
 * Permite realizar la accion de llamar en un dispositivo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public interface Callable {
    default String toCall(int number){
        String message = "Este telefono esta llamando al numero: " + number; 

        return message;        
    }
}
