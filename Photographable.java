/**
 * Interfaz Photographable
 * Permite realizar la accion de tomar una fotografia en un dispositivo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public interface Photographable {
    
    default String toPhotograph(){
        String message = "Este dispositivo puede tomar fotos!  *Toma una foto*";
        return message;
    }
}
