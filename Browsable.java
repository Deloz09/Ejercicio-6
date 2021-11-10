/**
 * Interfaz Browsable
 * Permite realizar la accion de navegar en internet en un dispositivo
 * 
 * @version 1.0, 08/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * Gustavo A. Gonzales P. - 21438
 */

 public interface Browsable {    

    default String toBrowse(String webPage){        
        String message = "Estoy navegando por la pagina " + webPage;

        return message;
    }
}
