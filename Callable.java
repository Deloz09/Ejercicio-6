public interface Callable {
    default String toCall(int number){
        String message = "Este telefono esta llamando al numero: " + number; 

        return message;        
    }
}
