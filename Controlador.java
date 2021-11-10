import java.util.ArrayList;

class Controlador{    

    public static void main(String[] args){       
        init();
        menu();
    }

    public static void init(){
        ArrayList<String[]> data = new ArrayList<String[]>();
        data  = ReadAndWrite.read();
        Product.setCounter(Integer.parseInt(data.get(0)[0]));

        for(int i = 1; i < data.size(); i++){
            if(data.get(i)[0].equals("smartphone")){
                Smartphone smartPhone = new Smartphone(data.get(i));
                Cart.addProduct(smartPhone);                

            }else if(data.get(i)[0].equals("cellphone")){
                CellPhone cellPhone = new CellPhone(data.get(i));
                Cart.addProduct(cellPhone);

            }else if(data.get(i)[0].equals("linephone")){
                LinePhone linePhone = new LinePhone(data.get(i));
                Cart.addProduct(linePhone);

            }else if(data.get(i)[0].equals("camera")){
                Camera camera = new Camera(data.get(i));
                Cart.addProduct(camera);

            }else if(data.get(i)[0].equals("laptop")){
                Laptop laptop = new Laptop(data.get(i));
                Cart.addProduct(laptop);

            }else if(data.get(i)[0].equals("smartTV")){
                SmartTV smartTV = new SmartTV(data.get(i));
                Cart.addProduct(smartTV);

            }else if(data.get(i)[0].equals("Tablet")){
                Tablet tablet = new Tablet(data.get(i));
                Cart.addProduct(tablet);

            }else if(data.get(i)[0].equals("smartwatch")){
                Smartwatch smartwatch = new Smartwatch(data.get(i));
                Cart.addProduct(smartwatch);

            }else if(data.get(i)[5].equals("desktop")){
                //Desktop desktop = new Desktop(data.get(i));

            }
        }

    }


    public static void exit(){

        String num = String.valueOf(Product.getCounter());
        ReadAndWrite.writer(num);

        for (Product product : Cart.getProducts()) {            
            ReadAndWrite.writer(product.objectToString());
        }
    }

    public static void menu(){
        boolean condicion = true;
        while(condicion){
            switch(Vista.mainMenu()){
                case 1:
                    store();
                    break;
                case 2:
                    break;
                case 3: 
                    exit();
                    condicion = false;
                    break;
            }
        }
    }

    public static void store(){
        boolean condicion = true;
        while(condicion){
            switch(Vista.displayStore()){
                case 1:
                    Smartphone smartphone = new Smartphone();
                    break;

                case 2:
                    CellPhone cellphone = new CellPhone();
                    break;

                case 3: 
                    LinePhone linePhone = new LinePhone();
                    break;

                case 4:
                    Camera camera = new Camera();
                    break;

                case 5:
                    Desktop desktop = new Desktop();
                    break;

                case 6:
                    Laptop laptop = new Laptop();
                    break;

                case 7: 
                    SmartTV smartTV = new SmartTV();
                    break;

                case 8:
                    Tablet tablet =  new Tablet();
                    break;

                case 9:
                    Smartwatch smartwatch = new Smartwatch();
                    break;

                case 10:
                    condicion = false;                    
                    break;
            }
        }
    }

    public static void displayFunctionality(int option){
        switch(option){
            case 1:                 
                break;
            case 2: // Reproducir Video
                break;
            case 3: // Fotografeable
                break;
            case 4: // Llamable
                break;
            case 5: // Navegable
            

        }

    }
}