public interface Browsable {    

    default String toBrowse(String webPage){        
        String message = "Estoy navegando por la pagina " + webPage;

        return message;
    }
}
