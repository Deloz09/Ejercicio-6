public interface Photographable {
    
    default String toPhotograph(){
        String message = "Este dispositivo puede tomar fotos!  *Toma una foto*";
        return message;
    }
}
