public interface Browsable {    

    default void toBrowse(String webPage){        
        String message = "Estoy navegando por la pagina " + webPage;
    }
}
