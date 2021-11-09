import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    static Scanner input = new Scanner(System.in);

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
    
    public static void calling(int num){
        System.out.println("llamando a: " + num);
    }



    public static void browsing(String webPage){
        System.out.println("Estoy navegando en la pagina: " + webPage);
    }
}
