/**
 * Interfaz Portable
 * Permite realizar la accion de portabilidad en un dispositivo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public interface Portable {
    default String toCarry(){
        String message = "Este dispositivo es portable!"; 
        return message;
    }
}
