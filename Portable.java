public interface Portable {
    default String toCarry(){
        String message = "Este dispositivo es portable!"; 
        return message;
    }
}
