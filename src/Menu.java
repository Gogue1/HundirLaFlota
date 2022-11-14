import java.util.Scanner;

public class Menu {
    private static Scanner option = new Scanner(System.in);

    public static void Menu() {
        int cantidadBarcos = 0;
        int i = 0;


        Tools.screenCleaner();
        showUserBoards.userBoards();
        System.out.println();
        System.out.println("¿Que desea hacer?");
        System.out.println("1 - Colocar barcos");
        System.out.println("2 - Disparar");

        switch (option.nextInt()) {
            case 1:;
            case 2:
                break;
            default:
                break;
        }


    }
}
