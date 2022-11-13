import java.util.Scanner;

public class colocarBarcos {
    public static String pedirPosicion(){
        Scanner posicion = new Scanner(System.in);
        System.out.println("Introduzca la posición en la que quiere colocar los barcos: ");
        return posicion.nextLine();
    }
}
