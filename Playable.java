public interface Playable {
    default String toPlay(){
        String message = "Estoy jugando un videojuego...";
        return message;
    }
}
