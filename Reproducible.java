/**
 * Interfaz Reproducible
 * Permite realizar la accion de reproducir un video  en un dispositivo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public interface Reproducible {
    
    default String toReproduce(){
        String message = "Estoy reproduciendo un video... \n";
        return message;
    }
}
