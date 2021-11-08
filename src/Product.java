import java.util.Random;

public abstract class Product{
    static Random rand = new Random();
    static int counter = -1;

    protected int price;
    protected int serialNo;
    protected int markerAR;
    protected String  brand;
    protected String fabricationDate;    
    protected String props;

    /**
     * Metodo constructor
     */
    public Product(){
        this.fabricationDate =  makeFabDate();
        this.markerAR = makeMarkerAR();

    }


    /**
     * Genera una fecha aleatoria de fabricacion
     * @return devuelve una fecha  en forma de String
     */
    private static String makeFabDate(){
        int day = (rand.nextInt(27)+1);
        int month = (rand.nextInt(11)+1);
        int year = (rand.nextInt(7) + 2014);
        
        String date = day + "/" + month + "/" + year;

        return date;
    }


    /**
     * Genera el codigo  para el AR Marker
     * @return devuelve un  numero entero 
     */
    private static int makeMarkerAR(){
        counter += 1;

        return counter;
    }


    



}


