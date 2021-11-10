/**
 * Interfaz Payable
 * Permite realizar la accion de jugar un videojuego en un dispositivo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public interface Playable {
    default String toPlay(){
        String message = "Estoy jugando un videojuego...";
        return message;
    }
}
