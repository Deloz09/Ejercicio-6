public interface Browsable {    

    default void toBrowse(){        
        Vista.browsing(Vista.askString("Ingrese la pagina en la que pagina desea navegar: "));
    }
}
