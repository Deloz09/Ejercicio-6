import java.util.Random;


public abstract class Product{


    static Random rand = new Random();
    static int counter = -1;

    protected int price;
    protected int serialNo;
    protected int markerAR;
    protected String  brand;
    protected String fabricationDate;   
    protected String type;  
    

    /**
     * Metodo constructor
     */
    public Product(){
        this.fabricationDate =  makeFabDate();
        this.markerAR = makeMarkerAR();
        

    }

    /**
     * Este es el metodo constructor para los datos guardados en el archivo .txt
     * @param data recibe un String con  los datos necesarios
     */
    public Product(String[] data){
        this.price = Integer.parseInt(data[0]);
        this.serialNo = Integer.parseInt(data[1]);
        this.markerAR = Integer.parseInt(data[3]);
        this.brand = data[4];
        this.fabricationDate = data[5];
        

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

    /**
     * Devuelve los datos del objeto como un String para que puedan ser almacenados persistentemente
     * @return un string con los datos
     */
    public String objectToString(){
        String str = String.valueOf(this.price) + "," + String.valueOf(this.serialNo) + ","
                    + String.valueOf(this.markerAR) + "," + this.brand + "," + this.fabricationDate + ","+ this.type +"\n";

        return str;
    }


    



}


