public interface Reproducible {
    
    default String toReproduce(){
        String message = "Estoy reproduciendo un video... \n";
        return message;
    }
}
