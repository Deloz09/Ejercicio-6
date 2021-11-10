import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Clase Vista
 * Encargada de recibir y mostrarle la información al usuario.
 * 
 * @version 1.0, 07/11/2021
 * finalizacion 09/11/2021
 * 
 * @author 
 * Diego E. Lemus L. - 21469
 * 
 */

public class Vista {
    static Scanner input = new Scanner(System.in);


    /**
     * Menu principal
     * @return devuelve un entero que representa la opcion 
     */
    public static int mainMenu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~ Menu Principal ~~~~~~~~~~~~~~~~~~~~~\n" +
                            "1. Ver Productos \n" +
                            "2. Ver Carrito \n" + 
                            "3. Comprar \n" +
                            "4. Salir \n");
        System.out.println("Ingrese opcion: ");

        int opcion = 0;
        try{
            opcion = input.nextInt();
            input.nextLine();

            if((opcion > 3)||(opcion < 1)){
                throw new IndexOutOfBoundsException();
            }

        }catch(IndexOutOfBoundsException e){
            System.out.println("La opcion ingresada esta fuera de rango");
            opcion = mainMenu();

        }catch(InputMismatchException e){
            input.nextLine();
            System.out.println("El tipo de dato ingresado no es valido");
            opcion = mainMenu();
        }

        return opcion;
    }



    public static int displayStore(){
        System.out.println("~~~~~~~~~~~~~ Tienda ~~~~~~~~~~~~~ \n" +
                            "1. Smartphone \n" +
                            "2. Telefono Celular \n" +
                            "3. Telefono Fijo \n" +
                            "4. Camara \n" +
                            "5. Desktop \n" +
                            "6. Laptop \n" +
                            "7. Smart TV \n" +
                            "8. Tablet \n" +
                            "9. Smartwatch \n" +
                            "10. Salir");

        int opcion = 0;
        try{
            System.out.println("Ingrese una opcion: ");
            opcion = input.nextInt();
            input.nextLine();

            if ((opcion > 10) || (opcion < 1)){
                throw new IndexOutOfBoundsException();                
            }

        }catch(IndexOutOfBoundsException e){
            System.out.println("Opcion fuera del rango \n");
            opcion = displayStore();

        }catch(InputMismatchException e){
            input.nextLine();
            System.out.println("El tipo de dato que ingreso es incorrecto");
            opcion = displayStore();
        }

        return opcion;
    }

    public static void addProductMenu(){
        System.out.println("~~~~~~~~~~~~~~ Add Product Menu ~~~~~~~~~~~~~~ \n" +
                            "1. Agregar Producto al Carrito \n" +
                            "2. Salir \n" );
    }

    public static int askNum(int limit, String message){
        System.out.println(message);

        int option = 0;
        try{
            System.out.println("Ingrese una opcion: ");
            option = input.nextInt();
            input.nextLine();

            if (option != 0){
                if(option > limit){
                    throw new IndexOutOfBoundsException();
                }
            }

        }catch(IndexOutOfBoundsException e){
            System.out.println("La opcion que usted ingreso esta fuera del rango");
            option = askNum(limit, message);

        }catch(InputMismatchException e){
            input.nextLine();
            System.out.println("El tipo de dato que ingreso es incorrecto");
            option = askNum(limit, message);
        }

        return option;
    }


    public static String askString(String message){
        System.out.println(message);

        String str = null;
        try{            
            str = input.nextLine();
                        
        }catch(InputMismatchException e){
            input.nextLine();
            System.out.println("El tipo de dato que ingreso es incorrecto");
            str = askString(message);
        }

        return str;
    }
   
    
    public static void displayMessage(String message){
        System.out.println(message);
    }



    /** 
     * Metodo que solicita el nombre del usuario
     * @return String
     * @throws Exception
     */
    public static String askUser(){
        String user = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese su nombre de usuario:");
                user = input.nextLine();
                if(user.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de usuario "+ e.toString();            
        }
        return user;
    }

    /** 
     * Metodo que solicita el nit del usuario
     * @return int
     * @throws Exception
     */
    public static int askNit(){
        int nit = 0;
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese su nit:");
                nit = input.nextInt();
                input.nextLine();
                if(nit == 0){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de nit "+ e.toString();            
        }
        return nit;
    }


    public static int functionalityMenu(int[] range, String options){
        int option = 0;

        System.out.println(options);
        try{
            System.out.println("\n Ingrese una opcion: ");
            option = input.nextInt();
            input.nextLine();

            if((option < range[0])||(option > range[1])){
                throw new IndexOutOfBoundsException();
            }

        }catch(IndexOutOfBoundsException e){
            System.out.println("Esa opcion esta fuera de rango\n");
            option = functionalityMenu(range, options);
        }catch(InputMismatchException e){
            input.nextLine();
            System.out.println("Ese tipo de dato es incorrecto\n");
            option = functionalityMenu(range, options);
        }

        return option;
    }


    public static int askPhone(){
        int num = 0;
        System.out.println("Ingrese un numero  de telefono");

        try{
            num = input.nextInt();
            input.nextLine();            
        }catch(InputMismatchException e){
            System.out.println("El tipo de dato que  ingreso no  es correcto");
            num = askPhone();
        }
        return num;
    }




    public static void printReceipt(String user, int nit, String fecha, int total){
        System.out.println("------------------FACTURA------------------");
        System.out.println("Nombre: "+user+"\t\t\tFecha: "+fecha);
        System.out.println("NIT: "+nit+"\n");
        System.out.println("Total a pagar: Q"+total);
    }



    public static void displayCart(ArrayList<Product> products){
        System.out.println("~~~~~~~~~~~~~~~~ Carrito de Compras ~~~~~~~~~~~~~~~~\n");
        for (Product product : products) {
            String[] str = product.objectToString().split(",");
            System.out.println("Tipo de producto: " + str[0] + "\n" +
                                "Precio: " + str[1] + "\n" +
                                "Numero de Serie : " + str[2] + "\n" +
                                "AR Marker: " + str[3] + "\n"  +
                                "Marca: " + str[4] + "\n" +
                                "Fecha de fabricacion: " + str[5] +"\n\n");

        }

    }
    
}
